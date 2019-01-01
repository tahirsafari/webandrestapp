package com.todo.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/todo")
public class RestTodoController {

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public Map<String, String> listTodo() {
		Map<String, String> keyValues = new HashMap<>();
		keyValues.put("id", "a129d");
		keyValues.put("title", "Rest API test");
		return keyValues;
	}
	
}
