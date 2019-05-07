package com.demo.impl;

import com.demo.service.DemoService;

public class DemoServiceImpl implements DemoService {

	public String sayHello(String name) {
		return "hello, " + name;
	}
}
