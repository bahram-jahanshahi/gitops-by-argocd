package com.example.gitopsbyargocd.controllers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloGitOpsByArgoCDControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @DisplayName("Should get http status 200 in any way")
    @Test
    void hello() {
        ResponseEntity<String> response = testRestTemplate
                .getForEntity(
                        "/api/v1/gitops/argocd",
                        String.class
                );
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}