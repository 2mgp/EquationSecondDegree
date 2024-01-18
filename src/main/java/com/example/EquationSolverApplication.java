package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.controller")
public class EquationSolverApplication {

    public static void main(String[] args) {
        SpringApplication.run(EquationSolverApplication.class, args);
    }
}

@Controller
class EquationController {

    @GetMapping("/")
    public String showEquationSolverPage() {
        return "EquationSolver"; // c'est le nom du fichier HTML sans l'extension
    }
}
