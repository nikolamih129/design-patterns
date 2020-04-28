package command;

public class KeyOnStartCommand implements Command {

	private Key key;
	@Override
	public void execute() {
		this.key.KeyOnStartPos();

	}
	public KeyOnStartCommand(Key key) {
		this.key=key;
	}

}
