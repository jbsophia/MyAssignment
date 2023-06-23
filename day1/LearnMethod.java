package week1.day1;

public class LearnMethod {
	public void driveCar() {
		System.out.println("Drive Car");

	}

	void brandName() {
		System.out.println("Brand Name");

	}

	private int addition(int num1, int num2) {
		num1 = 20;
		num2 = 40;
		int result = num1 + num2;
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		LearnMethod obj = new LearnMethod();
		obj.addition(10, 20);
		obj.brandName();
		obj.driveCar();

	}

}
