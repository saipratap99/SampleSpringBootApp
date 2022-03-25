package com.example.HelloWorldApp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.HelloWorldApp.models.Bus;

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
	
	@RequestMapping("/user")
	public String user(HttpServletRequest req,String name) {
		HttpSession session = req.getSession();
		session.setAttribute("name", name); // setting in JSP using JSTL
		return "welcome.jsp";
	}
	
	@RequestMapping("/add_bus_details")
	public String addBusDetails(Bus bus1, HttpSession session) {
		System.out.println(bus1);
//		HttpSession session = req.getSession();
		session.setAttribute("bus", bus1); // setting in JSP using JSTL
		return "bus_details.jsp";
	}
}
