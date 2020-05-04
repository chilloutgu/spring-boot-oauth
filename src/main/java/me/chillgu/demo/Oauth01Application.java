package me.chillgu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import me.chillgu.demo.config.AppProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class Oauth01Application {

	public static void main(String[] args) {
		SpringApplication.run(Oauth01Application.class, args);
	}

}
