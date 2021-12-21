package com.example.gitopsbyargocd;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitOpsByArgoCdApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(GitOpsByArgoCdApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application Version 1.1 is Started.");
    }
}
