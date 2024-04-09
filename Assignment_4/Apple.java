package com.app.fruits;

import java.util.Scanner;

public class Apple extends Fruit
{
//private String name;
private double weight;
private String colour;
Scanner sc=new Scanner(System.in);
public Apple() 
{
	super();
	super.setName("Apple");
}
public Apple(boolean isFresh,  double weight, String colour) {
	super(isFresh);
	//this.name = "Apple";
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
	
	
}
//public String getName() {
//	return this.name;
//}

public String taste()
{
	return "Sweet n Sour";
	
}
//public void setName(String name) {
//	this.name = name;
//}
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