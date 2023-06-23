package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,sum=0,temp;
		int n=34343;
		temp=n;
		while(n>0) {
			r=n%10;//getting remainder
			sum=(sum*10)+r;
			n=n/10;
		}
		
		if(temp==sum)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
		System.out.println("Not Palindrome");
		}
		

	}

}
