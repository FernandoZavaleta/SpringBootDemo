package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.intf.DemoInterface;

@RestController
public class DemoController {

	@Autowired
	private DemoInterface demoInterface;
	
	@GetMapping("/ISD-0001")
	public String HelloWordISD0001() {
		return demoInterface.HelloWordISD0001();
	}

}