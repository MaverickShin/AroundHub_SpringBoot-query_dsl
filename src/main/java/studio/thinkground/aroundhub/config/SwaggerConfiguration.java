package studio.thinkground.aroundhub.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Flature
 * @version 1.0.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    // 테스트 페이지 : localhost:포트번호/swagger-ui.html

    @Bean
    public Docket api() {
        // DocumentationPlugin
        return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo()) // api 정보를 넘김
            .select()
            .apis(RequestHandlerSelectors.basePackage("studio.thinkground.aroundhub")) // 읽어들일 패키지 범위를 지정
            .paths(PathSelectors.any())
            .build();
    }

    private ApiInfo apiInfo() {
        // api 정보를 생성
        return new ApiInfoBuilder()
            .title("Around Hub Open API Test with Swagger")
            .description("설명 부분")
            .version("1.0.0") // maven에 작성한 버전
            .build();
    }
}