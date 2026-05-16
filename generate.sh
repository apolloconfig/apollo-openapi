#!/bin/bash
set -e

SPEC_FILE="apollo-openapi.yaml"
JAVA_CLIENT_DIR="java-client"
SPRING_BOOT2_DIR="spring-boot2"
PYTHON_DIR="python"
RUST_DIR="rust"
TS_DIR="typescript"
PYTHON_TEMPLATE_DIR="templates/python"
OPENAPI_GENERATOR_VERSION="6.6.0"

if command -v openapi-generator >/dev/null 2>&1; then
  OPENAPI_GENERATOR=(openapi-generator)
elif command -v openapi-generator-cli >/dev/null 2>&1; then
  OPENAPI_GENERATOR=(openapi-generator-cli)
elif command -v npx >/dev/null 2>&1; then
  OPENAPI_GENERATOR=(npx @openapitools/openapi-generator-cli)
else
  echo "openapi-generator is required. Install openapi-generator or make npx available."
  exit 127
fi

export OPENAPI_GENERATOR_VERSION

JAVA_VERSION_LINE="$(java -version 2>&1 | head -n 1)"
if [[ "$JAVA_VERSION_LINE" =~ \"([0-9]+) ]] && [ "${BASH_REMATCH[1]}" -ge 9 ]; then
  export JAVA_TOOL_OPTIONS="${JAVA_TOOL_OPTIONS:+$JAVA_TOOL_OPTIONS }--add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED"
fi

echo "🧹 Cleaning old generated SDKs..."
rm -rf "$JAVA_CLIENT_DIR"
rm -rf "$SPRING_BOOT2_DIR"
rm -rf "$PYTHON_DIR"
rm -rf "$RUST_DIR"
rm -rf "$TS_DIR"

echo "🚀 Generating Python SDK..."
"${OPENAPI_GENERATOR[@]}" generate \
  -i "$SPEC_FILE" \
  -g python \
  -o "$PYTHON_DIR" \
  -t "$PYTHON_TEMPLATE_DIR" \
  --package-name apollo_openapi \
  --additional-properties=projectName=apollo-openapi,packageVersion=0.3.0

echo "🚀 Generating TypeScript SDK..."
"${OPENAPI_GENERATOR[@]}" generate \
  -i "$SPEC_FILE" \
  -g typescript-fetch \
  -o "$TS_DIR" \
  --additional-properties=npmName=apollo-openapi,npmVersion=0.3.0,typescriptThreePlus=true

echo "🚀 Generating Java Client SDK..."
"${OPENAPI_GENERATOR[@]}" generate \
  -i "$SPEC_FILE" \
  -g java \
  -o "$JAVA_CLIENT_DIR" \
  --additional-properties hideGenerationTimestamp=true \
  --additional-properties=groupId=com.apollo,artifactId=apollo-openapi-client,artifactVersion=0.3.0,packageName=com.apollo.openapi.client

echo "🚀 Generating Spring Boot 2 Server..."
"${OPENAPI_GENERATOR[@]}" generate \
  -i "$SPEC_FILE" \
  -g spring \
  -o "$SPRING_BOOT2_DIR" \
  --additional-properties hideGenerationTimestamp=true \
  --additional-properties=groupId=com.apollo,artifactId=apollo-openapi-server,artifactVersion=0.3.0,packageName=com.apollo.openapi.server,basePackage=com.apollo.openapi.server,configPackage=com.apollo.openapi.server.config,modelPackage=com.apollo.openapi.server.model,apiPackage=com.apollo.openapi.server.api,library=spring-boot,java8=true,interfaceOnly=false,delegatePattern=true,useTags=true

echo "📦 Adding Maven Wrapper to Spring Boot 2 project..."
cd "$SPRING_BOOT2_DIR"
mvn -N io.takari:maven:wrapper -Dmaven=3.8.6

cd ..

echo "💡 Spring Boot 2 project ready! To start the server, run:"
echo "   cd $SPRING_BOOT2_DIR && ./mvnw spring-boot:run"

if [ "$1" = "--start-spring-boot" ]; then
    echo "🚀 Starting Spring Boot server..."
    cd "$SPRING_BOOT2_DIR"
    ./mvnw spring-boot:run &
    echo "✅ Spring Boot server started in background. Access it at http://localhost:8080"
    cd ..
fi

echo "🚀 Generating Rust SDK..."
"${OPENAPI_GENERATOR[@]}" generate \
  -i "$SPEC_FILE" \
  -g rust \
  -o "$RUST_DIR" \
  --global-property models,supportingFiles \
  --additional-properties=packageName=apollo-openapi,packageVersion=0.3.0

echo "✅ SDK generation complete."

# this is for normalizing generated files and reducing version-only churn.
echo "Cleaning files (trailing spaces, CRLF, EOF newlines, generated version comments)..."
find . -type d \( -name .git -o -name .idea -o -name .mvn -o -name target -o -name build -o -name node_modules \) -prune -o \
  -type f \( -name "*.java" -o -name "*.xml" -o -name "*.properties" -o -name "*.md" -o -name "*.yml" -o -name "*.yaml" -o -name "*.gradle" -o -name "*.sh" -o -name "*.py" -o -name "*.pyi" -o -name "*.ts" -o -name "*.rs" -o -name ".editorconfig" -o -name ".gitignore" -o -name ".npmignore" -o -name "mvnw" -o -name "VERSION" \) -print0 \
| xargs -0 perl -i -0777 -pe 's/[ \t]+(?=\r?$)//mg; s/\r//g; s/^[ \t]*\* The version of the OpenAPI document: [^\r\n]*\R//mg; s/^[ \t]*The version of the OpenAPI document: [^\r\n]*\R//mg; s/\s*\z/\n/s'
echo "Cleaning files (trailing spaces, CRLF, EOF newlines, generated version comments)... Done!"
