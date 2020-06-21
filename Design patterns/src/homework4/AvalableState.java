package homework4;

public class AvalableState implements State {

	private String stateName= "Avalable State";
	
	@Override
	public void applyState(Context context) {
		context.setState(this);
		
	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return this.stateName;
	}

}
