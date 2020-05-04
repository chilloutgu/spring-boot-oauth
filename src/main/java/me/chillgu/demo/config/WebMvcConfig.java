package me.chillgu.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
 * spring boot에서는 @EnableWebMvc를 하지 않는다.
 * 오히려 spring boot에서 제공하는 설정이 사라짐.
 * 
 * @Configuartion + implements WebMvcConfigurer 조합으로만!
 * 
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	
	/*
	 * 	maxage란 무엇인가!
	 * 	만약 WebMvcConfig 객체가 여러개 생성된다면 상수에 static을 붙이겠으나,
	 * 	WebMvcConfig class는 하나만 생성하므로 final만 붙인다.
	 */
	
	private final long MAX_AGE_SEC = 3600;
	
	/*
	 *  모든 요청에 관하여 cors 정책을 설정함.
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
				.allowedOrigins("*")
				.allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS")
				.allowedHeaders("*")
				.allowCredentials(true)
				.maxAge(MAX_AGE_SEC);
	}
}
