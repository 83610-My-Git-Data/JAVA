package com.app.fruits;

import java.util.Scanner;

public class Fruit 
{
	private boolean isFresh;
	private String name;
	
	Scanner sc=new Scanner(System.in);
	

	public Fruit() 
	{
		
		this.isFresh =true ;
	}
	
	public void accept()
	{
		
		
	}
	public String taste()
	{
		return "No specific taste ";
	}
	public void display()
	{
		System.out.print("The state of fruit is ");
		if(isFresh==true)
		{
			System.out.println("Fresh ");
		}
		else
			System.out.println("stale");
	}
	
	public Fruit(boolean isFresh) {
		
		this.isFresh = isFresh;
	}

	public boolean isFresh() {
		return isFresh;
	}


	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}