package com.example.gitopsbyargocd.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/gitops")
public class HelloGitOpsByArgoCDController {

    @GetMapping("/argocd")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello GitOps By ArgoCD! Version 1.1");
    }
}
