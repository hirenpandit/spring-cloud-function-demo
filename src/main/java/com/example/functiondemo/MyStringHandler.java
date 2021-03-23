package com.example.functiondemo;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class MyStringHandler extends SpringBootRequestHandler<String, String> {
}
