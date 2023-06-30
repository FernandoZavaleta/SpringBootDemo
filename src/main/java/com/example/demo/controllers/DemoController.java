package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/ISD-0001")
	public String HelloWordISD0001() {
		return "HelloWordISD0001";
	}

}