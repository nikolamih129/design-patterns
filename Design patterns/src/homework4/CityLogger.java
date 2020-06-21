package homework4;

public class CityLogger extends Logger{
	
	
	public CityLogger() {
		this.level = Logger.City;
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("Error message: " + message);
	}

}
