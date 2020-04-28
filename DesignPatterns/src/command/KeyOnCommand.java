package command;

public class KeyOnCommand implements Command {

	
	private Key key;

	@Override
	public void execute() {
		this.key.KeyOn();

}
public KeyOnCommand(Key key) {
		this.key=key;
}	
}
