package com.nighthawk.spring_portfolio.mvc.calculator;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/calculator")
public class CalculatorApiController {
    @GetMapping("/calculate")
    public ResponseEntity<String> calculate(@RequestBody final String expression) {
        try {
            Calculator calculatedExpression = new Calculator(expression);
            return new ResponseEntity<>(calculatedExpression.toString(), HttpStatus.ACCEPTED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>("Internal Error/Parsing Error, check your expression", HttpStatus.BAD_REQUEST);
        }
    }
}