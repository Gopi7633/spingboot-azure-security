package com.security.com.security.controller;

import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @GetMapping(path = "/hello",produces = MediaType.APPLICATION_JSON_VALUE)
    @PreAuthorize("hasAuthority('APPROLE_Admin')")
    public String printHelloWorld(){
        return "Welcome to Print HELLO WORLD METHOD";
    }
}
