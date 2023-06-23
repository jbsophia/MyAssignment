package week1.day2;

public class NegativePositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=-40;
		if(number<0)
		{
			int i = Math.abs(number);
			System.out.println("The number" + number + " is converted into " + i);
		}
		
		else
		{
			System.out.println("Number is positive");
		}
	}

}
