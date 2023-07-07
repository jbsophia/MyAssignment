package week3.day1;

public class LearnOverloading {

	
		
public void add(int x, int y) {
	System.out.println(x+y);
}
public void add(int z, float y) {
	System.out.println(z+y);
}
public void add(int x, int y,float z) {
	System.out.println(x+y+z);
}

public static void main(String[] args) {
	LearnOverloading obj=new LearnOverloading();
	obj.add(10,0.2f);
	obj.add(10,20,0.2f);
	obj.add(10,20);	
}
}
