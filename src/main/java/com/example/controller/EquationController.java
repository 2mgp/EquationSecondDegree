package com.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EquationInput;
import com.example.EquationSolver;

@RestController
@RequestMapping("/api/equation")
public class EquationController {

    @PostMapping("/solve")
    public double[] solveEquation(@RequestBody EquationInput input) {
        EquationSolver solver = new EquationSolver();
        return solver.solve(input.getA(), input.getB(), input.getC());
    }
}

