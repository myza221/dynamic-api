package com.example.dynamic_api.config;

import com.example.dynamic_api.exceptions.ClientErrorDecoder;
import feign.codec.ErrorDecoder;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableFeignClients
@Configuration
public class ClientConfiguration {

//    @Bean
//    public OkHttpClient client() {
//        return new OkHttpClient();
//    }

    @Bean
    public ErrorDecoder errorDecoder() {
        return new ClientErrorDecoder();
    }

//    @Bean
//    public RequestInterceptor authInterceptor() {
//        return requestTemplate -> requestTemplate.header("Authorization", "Bearer token");
//    }
}
