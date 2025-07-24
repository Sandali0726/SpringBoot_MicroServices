package com.order.order.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class AppConfig {

    @Bean
    public NewTopic orderTopic() {
        return TopicBuilder.name("order-events")
                .partitions(3)
                .replicas(1)
                .build();
    }

    @Bean
    public WebClient inventoryWebClient() {
        return WebClient.builder()
                .baseUrl("http://inventory-service/api/v1")
                .build();
    }

    @Bean
    public WebClient productWebClient() {
        return WebClient.builder()
                .baseUrl("http://product-service/api/v1")
                .build();
    }
}
