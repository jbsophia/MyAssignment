package week3.day1;

public class AxisBank extends ICICIBank implements RBI,Bank{

	public void withDraw(){
	System.out.println("9 lacs");
	}

	
	public void kyc() {
		System.out.println("PAN");
		System.out.println("Voter ID");
	}
	
	public void openAccount() {
		
	}


	@Override
	public void loan() {
		System.out.println("8%");
		
	}
}
