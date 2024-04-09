package com.app.fruits;

import java.util.Scanner;

public class tester {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter size of basket ");
		int size=sc.nextInt();
		Fruit f;
		Fruit basket[]=new Fruit[size];
		int choice=0;
		int index=0;
		do {
			System.out.println("Welcome to Fruit Mart ");
			System.out.println("Press 1 to add Mango to the basket ");
			System.out.println("Press 2 to add Orange to the basket");
			System.out.println("Press 3 to add Apple to the basket ");
			System.out.println("Press 4 to display names of all fruits in basket ");
			System.out.println("Press 5 to Display name,color,weight , taste of all fresh fruits , in the basket.");
			System.out.println("Press 6 to Display tastes of all stale(not fresh) fruits in the basket");
			System.out.println("Press 7 to mark a fruit as stale ");
			System.out.println("Press 8 to mark sour fruits to stale ");
			
			System.out.println("-------------------------------------------------------------------------------------------------");
			System.out.println("Please enter choice ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				if(index<size)
				{
					f=new Mango();
					f.accept();
					basket[index]=f;
					index++;
				}
				else System.out.println("Basket is full ");
				break;
			case 2:
				if(index<size)
				{
					f=new Orange();
					f.accept();
					basket[index]=f;
					index++;
				}
				else System.out.println("Basket is full ");
				break;
			case 3:
				if(index<size)
				{
					f=new Apple();
					f.accept();
					basket[index]=f;
					index++;
				}
				else System.out.println("Basket is full ");
				break;
			case 4:
				int j=1;
				for(Fruit b:basket)
				{
					if(b!=null)
						System.out.println("The fruits in basket are at place "+j+" is "+b.getName());
					j++;
				}
				break;
			case 5:
				for(int i=0;i<index;i++)
				{
					if(basket[i].isFresh()==true)
					{
						basket[i].display();
					    System.out.println("The taste is "+basket[i].taste());
					    System.out.println("--------------------------------------------------------------------------------");
						
					}
				}
				break;
			case 6:
				for(Fruit b:basket)
				{
					if(b!=null)
					{
					if(b.isFresh()!=true)
					{
						b.display();
					}
					}
				}
				break;
			case 7:
			{
				//System.out.println("Please enter the fruit number in basket  which you want to mark as stale ");
				int x=1;
				for(Fruit b:basket)
				{
					if(b!=null)
						System.out.println("The fruits in basket are at place "+x+" is "+b.getName());
					x++;
				}
				System.out.println("Please enter the fruit number in basket  which you want to mark as stale ");
				int indexx=sc.nextInt();
				basket[indexx-1].setFresh(false);
			
			}
				break;
			case 8:
				for(Fruit b:basket)
				{
					if(b.taste()==" Sour ")
					{
						b.setFresh(false);
					}
				}
				break;
			case 0:
				System.out.println("------------Thank You------------------------ ");
				break;
					
					
			}
			
		}while(choice!=0);
		

		
	}

}