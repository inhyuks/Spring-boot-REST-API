package com.springboot.restapi.controller;

import com.springboot.restapi.domain.Hello;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"1. User"})
@RestController
@RequestMapping(value = "hello")
public class HelloController {
    @ApiOperation(value = "hello", notes = "hello")
    @GetMapping()
    public Hello get() {
        return new Hello(0, "Hello Spring Boot!");
    }
}