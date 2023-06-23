package week1.day1;

public class Mobile {
	public void sendSMS() {
		System.out.println("Hello sending SMS");
	}

	protected void allowVoiceCall() {
		System.out.println("Allow voice call");
	}

	private void takeVideo() {
		System.out.println("Take video call");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile objmob = new Mobile();
		objmob.sendSMS();
		objmob.allowVoiceCall();
		objmob.takeVideo();

	}

}
