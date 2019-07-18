package xyza;

public class Icici implements Rbi

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Icici h=new Icici();
	h.deposit();
	h.withdrawl();

	}

	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		System.out.println("I am overriden withdrawl in ICICI");
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("I am ovveriden deposit in ICICI");
		
	}

}

