package com.example.demo.business.impl;

import org.springframework.stereotype.Service;

import com.example.demo.business.intf.DemoInterface;

@Service
public class DemoImplement implements DemoInterface {

	@Override
	public String HelloWordISD0001() {
		return "HelloWordISD0001";
	}

	@Override
	public String HelloWordISD0002() {
		return "HelloWordISD0002";
	}

	@Override
	public String HelloWordISD0003() {
		return "HelloWordISD0003";
	}

	
	@Override
	public String HelloWordISD0005() {
		return "HelloWordISD0005";
	}

	@Override
	public String HelloWordISD0006() {
		return "HelloWordISD0006";
	}

}
