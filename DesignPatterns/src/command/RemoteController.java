package command;

public class RemoteController {
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	public void turnKey() {
		System.out.println("Turning the key");
		this.command.execute();
	}

}
