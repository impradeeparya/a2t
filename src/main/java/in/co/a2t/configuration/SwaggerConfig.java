package in.co.a2t.configuration;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Bean
  public Docket postsApi() {
    return new Docket(DocumentationType.SWAGGER_2).groupName("a2t-Api")
        .useDefaultResponseMessages(false).apiInfo(apiInfo()).select().paths(regex("/a2t.*"))
        .build();
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder().title("a2t Service").description("All a2t Service api of a2t")
        .termsOfServiceUrl("https://www.a2t.com")
        .contact(new Contact("a2t Service", "https://www.a2t.com", null)).version("1.0").build();
  }
}
