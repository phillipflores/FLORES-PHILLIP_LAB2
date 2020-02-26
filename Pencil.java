package com.practicelab2;

public class Pencil {
	
	private String brand;
	private String lead;
	private double length;
	private double price;
	
	public Pencil() {
		
	}
	
	public Pencil(String brand, String lead, double length, double price) {
		this.brand = brand;
		this.lead = lead;
		this.length = length;
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setLead(String lead) {
		this.lead = lead;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getLead() {
		return this.lead;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public double getPrice() {
		return this.price;
	}

}
