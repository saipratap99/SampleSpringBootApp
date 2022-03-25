package com.example.HelloWorldApp.models;

public class Bus {
	private int busId;
	private String serviceType;
	private int noOfSeats;
	
	public Bus(int busId, String serviceType, int noOfSeats) {
		this.busId = busId;
		this.serviceType = serviceType;
		this.noOfSeats = noOfSeats;
	}
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
