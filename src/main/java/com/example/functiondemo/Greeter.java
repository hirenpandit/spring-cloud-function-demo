package com.example.functiondemo;

import java.util.function.Function;

public class Greeter implements Function<String, String> {

    @Override
    public String apply(String s) {
        return "Hello, "+s+", and welcome to the spring cloud function!!";
    }
}
