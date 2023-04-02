package com.gateway.demo.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("example", r -> r.path("/example")
                        .uri("http://localhost:8080"))
                .route("google", r -> r.path("/google")
                        .uri("https://www.google.com"))
                .build();
    }



}
