package com.example.dynamic_api.service;

import com.example.dynamic_api.model.InfoDto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class MainService implements MainServiceInf{
    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public Object processApi(String body) throws Exception {
        HashMap<String, Object> rootNode = mapper.readValue(body, new TypeReference<>() {
        });
        InfoDto info = mapper.readValue(mapper.writeValueAsString(rootNode.get("info")), InfoDto.class);

        List<HashMap<String, Object>> vars = mapper.convertValue(rootNode.get("vars"), new TypeReference<List<HashMap<String, Object>>>() {
        });

        List<HashMap<String, Object>> request = mapper.convertValue(rootNode.get("request"), new TypeReference<List<HashMap<String, Object>>>() {
        });

        HashMap<String, Object> response = mapper.convertValue(rootNode.get("response"), new TypeReference<>() {
        });

        return null;
    }
}

