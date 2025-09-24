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
                                .description("<p>Apollo配置中心OpenAPI接口文档</p>  <h2>认证方式</h2> <p>所有 API 接口都需要通过 <code>Authorization</code> header 进行身份验证。</p>  <h3>获取 Token 的方式：</h3> <ol>   <li><b>Portal 管理界面获取</b>：登录 Portal → 管理员工具 → 开放平台授权管理 → 创建第三方应用，获取 Token。</li>   <li><b>Token 格式</b>：<code>Authorization: token_value</code></li>   <li><b>Token 权限</b>：按应用/环境/命名空间授予，建议不同用途分别创建。</li> </ol>  <h3>使用示例</h3> <pre><code class=\"language-bash\">curl -X GET \"http://localhost:8070/openapi/v1/apps\" \\ -H \"Authorization: your_token_here\"</code></pre> ")
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
