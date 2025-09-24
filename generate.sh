#!/bin/bash
set -e

SPEC_FILE="apollo-openapi.yaml"
SPRING_BOOT2_DIR="spring-boot2"
JAVA_DIR="java"
PYTHON_DIR="python"
RUST_DIR="rust"
TS_DIR="typescript"

echo "🧹 Cleaning old generated SDKs..."
rm -rf "$JAVA_DIR"
rm -rf "$SPRING_BOOT2_DIR"
rm -rf "$PYTHON_DIR"
rm -rf "$RUST_DIR"
rm -rf "$TS_DIR"
#
#echo "🚀 Generating Python SDK..."
#openapi-generator generate
#  -i "$SPEC_FILE"
#  -g python
#  -o "$PYTHON_DIR"
#  --package-name apollo_openapi
#  --additional-properties=projectName=apollo-openapi,packageVersion=0.0.1
#
#echo "🚀 Generating TypeScript SDK..."
#openapi-generator generate
#  -i "$SPEC_FILE"
#  -g typescript-fetch
#  -o "$TS_DIR"
#  --additional-properties=npmName=apollo-openapi,npmVersion=0.0.1,typescriptThreePlus=true
#
#echo "🚀 Generating Rust SDK..."
#openapi-generator generate
#  -i "$SPEC_FILE"
#  -g rus
#  -o "$RUST_DIR"
#  --global-property models,supportingFiles
#  --additional-properties=packageName=apollo-openapi,packageVersion=0.0.1
#
#echo "🚀 Generating Java SDK..."
#openapi-generator generate
#  -i "$SPEC_FILE"
#  -g java
#  -o "$JAVA_DIR"
#  --additional-properties=groupId=com.apollo,artifactId=apollo-openapi-client,artifactVersion=0.0.1,packageName=com.apollo.openapi.client
#
#echo "✅ SDK generation complete."


echo "🚀 Generating Spring Boot 2 Server..."
openapi-generator generate \
  -i "$SPEC_FILE" \
  -g spring \
  -o "$SPRING_BOOT2_DIR" \
  --additional-properties=groupId=com.apollo,artifactId=apollo-openapi-server,artifactVersion=0.0.1,packageName=com.apollo.openapi.server,basePackage=com.apollo.openapi.server,configPackage=com.apollo.openapi.server.config,modelPackage=com.apollo.openapi.server.model,apiPackage=com.apollo.openapi.server.api,library=spring-boot,java8=true,interfaceOnly=false,delegatePattern=true,useTags=true

echo "📦 Adding Maven Wrapper to Spring Boot 2 project..."
cd "$SPRING_BOOT2_DIR"
mvn -N io.takari:maven:wrapper -Dmaven=3.8.6

echo "Cleaning files (trailing spaces, CRLF, EOF newlines)..."
find . -type d \( -name .git -o -name .idea -o -name .mvn -o -name target -o -name build -o -name node_modules \) -prune -o \
  -type f \( -name "*.java" -o -name "*.xml" -o -name "*.properties" -o -name "*.md" -o -name "*.yml" -o -name "*.yaml" -o -name "*.sh" -o -name ".editorconfig" -o -name ".gitignore" -o -name "mvnw" -o -name "mvnw.cmd" \) -print0 \
| xargs -0 perl -i -0777 -pe 's/[ \t]+(?=\r?$)//mg; s/\r//g; s/\s*\z/\n/s'
echo "Done."

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
