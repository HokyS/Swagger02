package com.example.Swagger02.controllers;

import com.example.Swagger02.entities.ArithmeticOperation;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {


        @GetMapping("")
        @ApiOperation(value = "Welcome message", notes = "Welcome to math operations")
        public String welcomeMathMsg() {
            return "Welcome to Math";
        }

    @GetMapping("/division-info")
    @ApiOperation(value = "Division details", notes = "The method returns a info for division")
    public ArithmeticOperation details() {
        return new ArithmeticOperation(
        "Division",
                2,
                "Division is the opposite of multiplication. If 3 groups of 4 make 12 in multiplication, " +
                        "12 divided into 3 equal groups give 4 in each group in division.",
                new String[]{
                        "Dividend: The dividend is the number that is being divided in the division process.",
                        "Divisor: The number by which the dividend is being divided by is called the divisor.",
                        "Quotient: The quotient is a result obtained in the division process.",
                        "Remainder: Sometimes, we cannot divide things exactly. There may be a leftover number."
                });
    }


    @GetMapping("/multiplication")
    @ApiOperation(value = "Multiplication message", notes = "The methods returns a multiplication")
    public int product(@RequestParam int x ,int y){
            return x * y;
    }

    @GetMapping("/square/{n}")
    @ApiOperation(value = "Square message", notes = "The methods returns a square")
    public int square(@PathVariable int n){
        return n * n;
        }
}
