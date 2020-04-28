package command;

public class CommandMai {

	public static void main(String[] args) {
	
		RemoteController remoteController=new RemoteController();
		Key key=new Key();
		
		
		Command keyOnStartCommand = new KeyOnStartCommand(key);
		Command keyOnCommand= new KeyOnCommand(key);
		Command keyOffCommand= new KeyOffCommand(key);
		
		remoteController.setCommand(keyOnCommand);
		remoteController.turnKey();
		
		remoteController.setCommand(keyOnStartCommand);
		remoteController.turnKey();
		
		remoteController.setCommand(keyOffCommand);
		remoteController.turnKey();

	}

}
