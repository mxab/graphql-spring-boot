package com.embedler.moon.graphql.boot;

import com.coxautodev.graphql.tools.SchemaParserOptions;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphQLToolsSampleApplication {

  public static void main(String[] args) {
    SpringApplication.run(GraphQLToolsSampleApplication.class, args);
  }

  @Bean
  public SchemaParserOptions schemaParserOptions() {
    return SchemaParserOptions.newOptions().objectMapperConfigurer((mapper, context) -> {
      mapper.registerModule(new JavaTimeModule());
    }).build();
  }
}
