package io.egen;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan
public class App extends WebMvcConfigurerAdapter {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("*//*").allowedMethods("GET","POST","PUT","DELETE")
                .allowedOrigins("http://mocker.egen.io/?").allowedHeaders("accepts","Origin",
                "Access-Control-Request-Method","Access-Control-Request-Method")
                .allowCredentials(false).maxAge(3600);
                    }
}

