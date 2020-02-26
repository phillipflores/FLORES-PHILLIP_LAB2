package com.practicelab2;

public class test {

	public static void main(String[] args) {

		Pencil p1 = new Pencil();
		
		p1.setBrand("Mongol Pencil");
		p1.setLead("No. 2");
		p1.setLength(7.5);
		p1.setPrice(94.75);
		
		System.out.println("Pencil #1");
		System.out.println("Brand : " + p1.getBrand());
		System.out.println("Lead  : " + p1.getLead());
		System.out.println("Length: " + p1.getLength() + " in");
		System.out.println("Price : " + p1.getPrice()+ " php" + "\n");
		
		Pencil p2 = new Pencil("Faber-Castell", "0.7mm leads", 13, 587.50);
		
		System.out.println("Pencil #2");
		System.out.println("Brand : " + p2.getBrand());
		System.out.println("Lead  : " + p2.getLead());
		System.out.println("Length: " + p2.getLength() + " in");
		System.out.println("Price : " + p2.getPrice() + " php" + "\n");
		
		MechanicalPencil mp1 = new MechanicalPencil();
		
		mp1.setBrand("Pilot");
		mp1.setLead("Graphite Lead");
		mp1.setLength(7.5);
		mp1.setPrice(1277.63);
		mp1.setLeadWidth(0.5);
		
		System.out.println("Mechanical Pencil #1");
		System.out.println("Brand     : " + mp1.getBrand());
		System.out.println("Lead      : " + mp1.getLead());
		System.out.println("length    : " + mp1.getLength() + " in");
		System.out.println("Price     : " + mp1.getPrice() + " php");
		System.out.println("Lead Width: " + mp1.getLeadWidth() + " mm");
		
	}

}
