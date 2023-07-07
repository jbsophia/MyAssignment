package week3.day1;

public class Samsung extends AndroidTV {
	
	public void playVideo() {
		System.out.println("play Video");
	}
	
	public static void main(String[] args) {
		Samsung phone = new Samsung();
		phone.playVideo();
		phone.openApp();
		
	}
}
