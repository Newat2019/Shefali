package xyza;

public class firstclass {
	
	int a=10, b=20, c;

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
		
		firstclass obj=new firstclass();
		obj.add();
		obj.sub();
	
		
		firstclass obj1=new firstclass();
		obj1.add();
		obj1.sub();
	}

}
