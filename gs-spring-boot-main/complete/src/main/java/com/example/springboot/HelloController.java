package com.example.springboot;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.util.JSONWrappedObject;
import com.google.gson.Gson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@PostMapping("/payload")
	public String payload(@RequestBody Object obj) {

		String jsonString = new Gson().toJson(obj, Map.class);
		System.out.println(jsonString);
		return "working";
	}

}
