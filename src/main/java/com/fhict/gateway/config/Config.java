package com.fhict.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;

@Configuration
public class Config {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/tweet/**")
                        .uri("http://localhost:8081/"))

                .route(r -> r.path("/profile/**")
                        .uri("http://localhost:8082/"))

                .route(r -> r.path("/relation/**")
                        .uri("http://localhost:8083/"))

                .build();
    }
}