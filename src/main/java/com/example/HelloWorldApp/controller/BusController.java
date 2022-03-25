package com.example.HelloWorldApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.HelloWorldApp.dao.BusRepo;
import com.example.HelloWorldApp.model.Bus;


@Controller
@RequestMapping("/bus")
public class BusController {
	
	@Autowired
	BusRepo busRepo;
	
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "<h2>Welcome to Online bus booking System</h2>";
	}
	
	@GetMapping("/add")
	public ModelAndView getBusDetails(String msg) {
		ModelAndView mv = new ModelAndView();
		System.out.println(msg);
		mv.addObject("msg", msg);
		mv.setViewName("/bus_views/add_form.jsp");
		return mv;
	}
	
	@PostMapping("/add")
	public ModelAndView addBusDetails(Bus bus) {
		busRepo.save(bus);
		return getBusDetails("Bus details added!");
	}
}
