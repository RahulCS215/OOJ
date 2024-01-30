//program to show exception handling

import java.util.Scanner;

class WrongAge extends Exception
{
	public WrongAge(String s)
	{
		super(s);
	}
}

class Father
{
	protected int fatAge;
	public Father() throws WrongAge
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter father's age : ");
		fatAge = s.nextInt();
		if(fatAge < 0)
			throw new WrongAge("Age cannot be negative");
	}
	public void displayfat()
	{
			System.out.println("father's age is : "+fatAge);
	}
}

class Son extends Father
{
	private int sonAge;
	public Son() throws WrongAge
	{
		super();
		Scanner s = new Scanner(System.in);
		System.out.println("enter the son's age : ");
		sonAge = s.nextInt();
		if(sonAge >= fatAge)
		{
			throw new WrongAge("son's age is more than or equal to father's age");
		}
		else if(sonAge<0)
		{
			throw new WrongAge("age cannot be negative");
		}
	}
	public void display()
	{
		System.out.println("son's age is : "+sonAge);
	}
}

public class Mainfatson
{
	public static void main(String args[])
	{
		try
		{
			Son son = new Son();
			son.displayfat();
			son.display();
		}
		catch(WrongAge e)
		{
			System.out.println("error: "+e.getMessage());
		}
	}
}
				
	