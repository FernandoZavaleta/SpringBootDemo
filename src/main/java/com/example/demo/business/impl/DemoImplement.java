package com.example.demo.business.impl;

import org.springframework.stereotype.Service;

import com.example.demo.business.intf.DemoInterface;

@Service
public class DemoImplement implements DemoInterface {

	@Override
	public String HelloWordISD0001() {
		return "HelloWordISD0001";
	}

}
