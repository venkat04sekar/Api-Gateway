package com.payment.module.api.gateway.config;

import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    @LoadBalanced
    public WebClient.Builder loadBalancedWebClientBuilder(){
        return  WebClient.builder();
    }
}
