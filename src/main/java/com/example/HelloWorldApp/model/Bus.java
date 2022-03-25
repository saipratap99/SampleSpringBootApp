package com.example.HelloWorldApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bus {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int busId;
	private String serviceType;
	private int noOfSeats;
	
//	public Bus(int busId, String serviceType, int noOfSeats) {
//		this.busId = busId;
//		this.serviceType = serviceType;
//		this.noOfSeats = noOfSeats;
//	}
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	@Override
	public String toString() {
		return busId + " : " + serviceType + " : " + noOfSeats ;
	}
	
	
	
}
