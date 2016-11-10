package com.innovationlab.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

	@RequestMapping("/account-service")
	public List<String> sayHello() {
		List<String> list = new ArrayList<>();

		list.add("vasu");
		list.add("chander");

		return list;
	}
}
