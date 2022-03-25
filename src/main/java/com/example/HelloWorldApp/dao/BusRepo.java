package com.example.HelloWorldApp.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.HelloWorldApp.model.Bus;

public interface BusRepo extends CrudRepository<Bus, Integer> {
	
}
