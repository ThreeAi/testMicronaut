package com.example.controllers;


import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.View;

@Controller("/")
public class HelloController {

    @View("hello")
    @Get("/")
    public void index() {

    }
}
