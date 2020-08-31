package com.sp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
/*

http://localhost:PORT/v2/api-docs
 adresinde dokumantasyon json dosyasi seklinde olusmaktadir. JSON verilerini kopyalayip
 https://editor.swagger.io/ adresinde kullanilirsa gorsel olarak api dokumantasyonu elde edilir.

 Editor Kullanmadan Yapilmak istenirse Swagger UI tanimlanmasi gerekmektedir.
 Boylece localhost:8080/swagger-ui.html adresinden api doc ulasilabilir.
 */
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.sp"))
                .paths(PathSelectors.regex("/.*"))
                .build().apiInfo(apiEndPointsInfo());

    }
    private ApiInfo apiEndPointsInfo(){
        return new ApiInfoBuilder().title("Spring Boot Swagger Ornegi")
                .description("Kisi Api Dokumantasyonu")
                .contact(new Contact("Serkan Polat","",""))
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .version("1.0.0")
                .build();
    }

}
