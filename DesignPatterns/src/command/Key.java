package command;

public class Key {
	
	private boolean keypPosition;
	private boolean keyOnStart;
	
	public void KeyOn() {
		System.out.println("Key is on the On position");
		this.keypPosition=true;
	}
	
	public void KeyOff() {
		System.out.println("Key is on the Off position");
		this.keypPosition=false;
	}
	
	public void KeyOnStartPos() {
		System.out.println("Key is on the Start Position");
		this.keyOnStart=true;
		this.keypPosition=true;
	}

}
