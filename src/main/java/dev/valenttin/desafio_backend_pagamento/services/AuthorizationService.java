package dev.valenttin.desafio_backend_pagamento.services;

import dev.valenttin.desafio_backend_pagamento.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.Map;


@Service
public class AuthorizationService {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${app.authorizationApi}")
    private String authApiUrl;

    public boolean authorizeTransaction(User sender, BigDecimal value) throws Exception {
        ResponseEntity<Map> authorizationResponse = restTemplate.getForEntity(this.authApiUrl, Map.class);

        if(authorizationResponse.getStatusCode() == HttpStatus.OK && authorizationResponse.getBody() != null){
            Map<String, Object> data = (Map<String, Object>) authorizationResponse.getBody().get("data");
            return data != null && Boolean.TRUE.equals(data.get("authorization"));
        } else return false;
    }
}