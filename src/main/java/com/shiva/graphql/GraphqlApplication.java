package com.shiva.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class GraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}
	
	// @Bean
	// CommandLineRunner cmdlr(CountryService service, CountryRepository repo) {
	// 	return args -> {
	// 		Mono<List<Country>> countries = service.getCoutries();
	// 		countries.subscribe(repo::saveAll);
	// 	};
	// }

}	