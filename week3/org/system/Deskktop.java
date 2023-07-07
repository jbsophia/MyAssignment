package org.system;
//Single inheritance
public class Deskktop extends Computer {
	public void desktopSize()
	{
		System.out.println("20.8 cm");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Deskktop d=new Deskktop();
d.desktopSize();
d.computerModel();
	}

}
