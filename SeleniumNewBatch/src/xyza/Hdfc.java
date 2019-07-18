package xyza;

public class Hdfc implements Rbi
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Hdfc i=new Hdfc();
	i.deposit();
	i.withdrawl();
		
	}
	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		System.out.println("I am ovveriden deposit in HDFC");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("I am ovveriden withdrawl in HDFC");
	}
	}


