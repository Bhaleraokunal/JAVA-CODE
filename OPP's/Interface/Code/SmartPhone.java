package interface1;

public class SmartPhone implements Camera, MusicPlayer {

	@Override
	public void playMusic() {
		System.out.println("Music is played on smartphone");
		
	}

	@Override
	public void photo() {
		System.out.println("Photo is taken by smartPhone");
		
	}

	@Override
	public void record() {
		System.out.println("Recording is on, on smartPhone");
		
	}

}
