package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jio {
	
	@Value("${value:Pranesh}")
	private String name;
	
	@GetMapping("/")
	public String display() {
		return "Hey... "+name;
	}
}