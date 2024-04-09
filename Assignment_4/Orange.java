package com.app.fruits;

import java.util.Scanner;

public class Orange extends Fruit
{
	
	private double weight;
	private String colour;
	Scanner sc=new Scanner(System.in);
	public Orange() 
	{
		super();
		super.setName("Orange");
	}
	public Orange(boolean isFresh,  double weight, String colour) {
		super(isFresh);
		
		this.weight = weight;
		this.colour = colour;
	}

	public void accept()
	{
//		System.out.println("Please enter name of fruit ");
//		name=sc.nextLine();
		System.out.println("Please enter weight ");
		weight=sc.nextDouble();
		System.out.println("Please enter colour ");
		colour=sc.next();
//		System.out.println("Please enter state of fruit if fresh press 1 or default it will be stale ");
//		int i;
//		i=sc.nextInt();
//		super.accept(i);
	}

	public void display()
	{
		System.out.println("Name of fruit is "+super.getName());
		System.out.println("Weight of fruit is "+weight +"gram");
		System.out.println("Colour of fruit is "+colour);
		super.display();
	//	System.out.println("--------------------------------------------------------------------------");
	}
	public String taste()
	{
		return " Sour ";
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}


}