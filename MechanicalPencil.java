package com.practicelab2;

public class MechanicalPencil extends Pencil {
	
	private double leadWidth;
	
	public MechanicalPencil() {
		
	}
	
	public MechanicalPencil(String brand, String lead, double length, double price, double leadWidth) {
		super(brand, lead, length, price);
		this.leadWidth = leadWidth;
	}
	
	public void setLeadWidth(double leadWidth) {
		this.leadWidth = leadWidth;
	}
	
	public double getLeadWidth() {
		return this.leadWidth;
	}

}
