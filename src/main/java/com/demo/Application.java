package com.demo;

import java.io.IOException;

import com.demo.impl.DemoServiceImpl;
import com.demo.service.DemoService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

public class Application {
	public static void main(String[] args) throws IOException {
		ServiceConfig<DemoService> service = new ServiceConfig<DemoService>();
		service.setApplication(new ApplicationConfig("dubbo-demo-provider"));
		service.setRegistry(new RegistryConfig("zookeeper://127.0.0.1:2181"));
		service.setInterface(DemoService.class);
		service.setRef(new DemoServiceImpl());
		service.export();
		System.out.println("dubbo-demo-provider is running.");
		System.in.read();
	}
}
