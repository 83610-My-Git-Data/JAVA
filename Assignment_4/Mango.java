package com.app.fruits;

import java.util.Scanner;

public class Mango extends Fruit
{
	//private String name;
	private double weight;
	private String colour;
	Scanner sc=new Scanner(System.in);
	public Mango() 
	{
		super();
		super.setName("Mango");
	}
	public Mango(boolean isFresh,  double weight, String colour) {
		super(isFresh);
		
		this.weight = weight;
		this.colour = colour;
	}

	public void accept()
	{

		System.out.println("Please enter weight ");
		weight=sc.nextDouble();
		System.out.println("Please enter colour ");
		colour=sc.next();

	}

	public void display()
	{
		System.out.println("Name of fruit is "+super.getName());
		System.out.println("Weight of fruit is "+weight +"gram");
		System.out.println("Colour of fruit is "+colour);
		super.display();
		//System.out.println("--------------------------------------------------------------------------");
	}
	public String taste()
	{
		return " Sweet ";
	}
	
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