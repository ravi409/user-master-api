package com.myworks.usermaster;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.Api;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
class SwaggerConfiguration {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
	            .apis(RequestHandlerSelectors
	                .basePackage("com.myworks.usermaster.controller"))
	            .paths(PathSelectors.regex("/.*"))
	            .build().apiInfo(apiInfo());
	}

	@Bean
	public ApiInfo apiInfo() {
		final ApiInfoBuilder builder = new ApiInfoBuilder();
		builder.title("My Application API through Swagger UI").version("1.0").license("(C) Copyright Test")
				.description("List of all the APIs of My Application App through Swagger UI");
		return builder.build();
	}

}