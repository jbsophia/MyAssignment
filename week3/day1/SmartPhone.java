package week3.day1;

public class SmartPhone extends AndroidPhone{
	public void takeVideo()
	{
		System.out.println("Take the video");
	}
	public void takeVideo(int x)
	{
		System.out.println("Take a video");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SmartPhone obj=new SmartPhone();
obj.takeVideo();
	}

}
