package Bank;

public class AxisBank extends BankInfo { //overridden method

	public void deposit()
	{
		System.out.println("Deposit amount");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankInfo obj1=new BankInfo();
obj1.deposit();
BankInfo obj2=new AxisBank();
obj2.deposit();
	}

}
