package com.todo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/web/todo")
public class WebTodoController {

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addTodo(Model model) {
		return "addTodo";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String postTodo(Model model) {
		return "listTodo";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listTodo(Model model) {
		return "listTodo";
	}
}
