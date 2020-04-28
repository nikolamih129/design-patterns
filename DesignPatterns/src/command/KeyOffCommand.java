package command;

public class KeyOffCommand implements Command {

	private Key key;
		public KeyOffCommand(Key key) {
		this.key=key;
}
		@Override
		public void execute() {
		this.key.KeyOff();

		}

}
