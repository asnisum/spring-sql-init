package com.chanmul;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

@SpringBootApplication
public class DatabaseApplication {
  @Autowired
  private DishRepository dishRepository;

  public static void main(String[] args) {
    SpringApplication.run(DatabaseApplication.class, args);
  }

  @Bean
  public String aaa() {
    List<Dish> all = dishRepository.findAll();

    System.out.println("-------");

    all.forEach(System.out::println);


    return "ads";
  }

  // @Bean
  // public DataSourceInitializer dataSourceInitializer(final DataSource dataSource) {
  //   ResourceDatabasePopulator resourceDatabasePopulator = new ResourceDatabasePopulator();
  //   ClassPathResource schema = new ClassPathResource("schema-h2.sql");
  //   ClassPathResource data = new ClassPathResource("data-h2.sql");
  //   if(schema.exists()) {
  //     resourceDatabasePopulator.addScripts(schema);
  //   }
  //   if(data.exists()) {
  //     resourceDatabasePopulator.addScript(data);
  //   }
  //   DataSourceInitializer dataSourceInitializer = new DataSourceInitializer();
  //   dataSourceInitializer.setDataSource(dataSource);
  //   dataSourceInitializer.setDatabasePopulator(resourceDatabasePopulator);
  //   return dataSourceInitializer;
  // }
}
