package com.example.HelloWorldApp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/home")
	public String sayHello() {
		return "home.jsp";
	}
	
	@RequestMapping("/search")
	public String search(HttpServletRequest req, HttpServletResponse res) {
		
		HttpSession session = req.getSession();
		String busType = req.getParameter("bus_type");
		session.setAttribute("bus_type", busType); // setting in JSP using JSTL
		return "search.jsp";
	}
}
