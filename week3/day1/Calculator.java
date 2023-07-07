package week3.day1;

public class Calculator {

	
	public void add(int x, int y) {
		System.out.println(x+y);
	}
	public void add(int x, int y , int z) {
		System.out.println(x+y+z);
	}
	public void multiple(double x, double y) {
		System.out.println(x*y);
	}
	public void multiple(float x, float y) {
		System.out.println(x*y);
	}
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		obj.add(10,5);
		obj.add(10,20,30);
		obj.multiple(10,20);
		obj.multiple(10,20);
	}
	

}

