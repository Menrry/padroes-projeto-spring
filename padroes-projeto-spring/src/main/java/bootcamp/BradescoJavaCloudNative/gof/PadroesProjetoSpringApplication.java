package bootcamp.BradescoJavaCloudNative.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 * 
 * Para este proyecto que usa Java 21 y utiliza Spring Boot, SpringDoc OpenAPI 
 * (springdoc-openapi-starter-webmvc-ui) es la dependencia recomendada 
 * para integrar la documentación de esta API con el estándar OpenAPI para 
 * proporcionar una interfaz de usuario (Swagger UI) para explorarla.
 * 
 * http://localhost:8080/swagger-ui.html
 * 
 * @author Menrry
 */
@EnableFeignClients
@SpringBootApplication
public class PadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesProjetoSpringApplication.class, args);
	}

}
