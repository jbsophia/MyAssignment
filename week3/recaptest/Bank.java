package recaptest;

public class Bank {
	
	int deposit;
	float rof;
	public void deposit() {
		System.out.println("Deposit amount is");
	}
	public void withdrawal()
	{
		System.out.println("amount of withdrawal");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank obj1=new Bank();
		obj1.deposit();
		Bank obj2=new Bank();
		obj2.withdrawal();
		System.out.println("Total amount is");

	}

}
