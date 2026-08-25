package com.eazybytes.accounts.confing;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Accounts Microservice REST API Documentation",
                description = "Accounts Microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "EazyBank",
                        email = "yousef@gmail.com",
                        url = "https://eazybank.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.apache.org/licenses/LICENSE-2.0"
                )
        ), externalDocs = @ExternalDocumentation(
        description = "Accounts Microservice REST API Documentation",
        url = "https://eazybank.com"
)
)
public class OpenApiConfig {
}