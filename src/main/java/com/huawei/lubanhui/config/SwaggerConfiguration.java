package com.huawei.lubanhui.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    public Docket defaultApi2(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .groupName("1.0版本")
                .select()
                .apis(RequestHandlerSelectors.basePackage(("com.huawei.lubanhui.controller")))
                .paths(PathSelectors.any())
                .build();
        return docket;

    }

}
