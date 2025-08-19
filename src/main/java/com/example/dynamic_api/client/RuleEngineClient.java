package com.example.dynamic_api.client;

import com.example.dynamic_api.config.ClientConfiguration;
import com.example.dynamic_api.model.RuleDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "rule-engine-service",
        url = "http://localhost:8081/rule-engine",
        configuration = ClientConfiguration.class)
public interface RuleEngineClient {

    @PostMapping("/saveRule")
    List<String> saveRule();

    @GetMapping(value = "/getRule")
    List<RuleDto> getAllRule();

}