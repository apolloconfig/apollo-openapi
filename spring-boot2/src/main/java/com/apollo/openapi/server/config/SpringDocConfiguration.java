package com.apollo.openapi.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "com.apollo.openapi.server.config.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Apollo OpenAPI")
                                .description("Apollo配置中心OpenAPI接口文档  ## 认证方式  所有API接口都需要通过Authorization header进行身份验证。  ### 获取Token的方式：  1. **Portal管理界面获取**：    - 登录Apollo Portal管理界面    - 进入\"管理员工具\" -> \"开放平台授权管理\"    - 创建第三方应用，获取Token  2. **Token格式**：    ```    Authorization: token_value    ```  3. **Token权限**：    - Token具有对应应用的读写权限    - 不同Token可能有不同的环境和命名空间权限    - 建议为不同用途创建不同的Token  ### 使用示例： ```bash curl -X GET \"http://localhost:8070/openapi/v1/apps\" \\      -H \"Authorization: your_token_here\" ``` ")
                                .version("1.0.0")
                )
                .components(
                        new Components()
                                .addSecuritySchemes("ApiKeyAuth", new SecurityScheme()
                                        .type(SecurityScheme.Type.APIKEY)
                                        .in(SecurityScheme.In.HEADER)
                                        .name("Authorization")
                                )
                )
        ;
    }
}