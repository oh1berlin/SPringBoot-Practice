package com.example.SB2.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
@RequestMapping("/")

public String home() {
	return "Hello World! This is a Spring Boot Application.";
}


}
