package interface1;

public class SmartPhoneDriver {
	public static void main(String[] args) {
		Camera c1 = new SmartPhone();
		
		c1.photo();
		c1.record();
		
		
		
		MusicPlayer m1 = new SmartPhone() ;
		
		m1.record();
		m1.playMusic();
		
		
		SmartPhone s1 = new SmartPhone() ;
		
		s1.playMusic();
		s1.record();
		s1.photo();
		
		
		
	}
}
