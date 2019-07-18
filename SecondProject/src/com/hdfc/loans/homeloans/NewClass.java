package com.hdfc.loans.homeloans;

public class NewClass {
	
	int a=10, b=200, c;

	public void add()
	{
		c=a+b;
		System.out.println("Addition of two number is : " + c);
	}
	public void sub()
	{
		c=a-b;
		System.out.println("Subtraction of two number is : " + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hi!");
		
		NewClass obj=new NewClass();
		obj.add();
		obj.sub();
	
		
		NewClass obj1=new NewClass();
		obj1.add();
		obj1.sub();
	}

}
