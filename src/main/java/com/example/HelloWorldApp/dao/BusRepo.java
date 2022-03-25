package com.example.HelloWorldApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.HelloWorldApp.model.Bus;

public interface BusRepo extends CrudRepository<Bus, Integer> {

	List<Bus> findByNoOfSeats(int i);

	List<Bus> findByNoOfSeatsGreaterThan(int i);

	@Query("from Bus where no_of_seats > ?1 order by service_type")
	List<Bus> findByNoOfSeatsSorted(int i);
}