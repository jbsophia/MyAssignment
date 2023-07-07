package week3.day1;

public abstract class ICICIBank {

	int deposit=30000;
	public void openAccount() {//implemented
		
		System.out.println("Open account from abstract");
	}
	public abstract void loan();//unimplemented method
}
