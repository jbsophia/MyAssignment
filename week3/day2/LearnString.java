package week3.day2;

public class LearnString {

	public static void main(String[] args) {
		
		//as literal
		String s="Testleaf";
		String s2="Testleaf";
		
		//as instance
		String s1=new String("testleaf");
		
		//compare the reference
		System.out.println(s==s1);
		System.out.println(s==s2);//literal same reference
		
		//compare the string values
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		
		int length=s.length();
		System.out.println(length);
		System.out.println(s.length());
		
		System.out.println(s.contains("Testleaf"));
		
		String output="No records to display";
		System.out.println(output.contains("no"));
		char[] charArray=output.toCharArray();
		for(int i=0;i< charArray.length;i++)
		{
System.out.println(charArray[i]);
	}
		
		//print the string in reverse
String input="Sophia";
char[]ch=input.toCharArray();
for(int i=ch.length-1;i>=0;i--)
{
System.out.println(ch[i]);
}
	}
}
