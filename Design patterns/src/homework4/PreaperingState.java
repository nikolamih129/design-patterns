package homework4;

public class PreaperingState implements State {
	
	private String stateName= "Preapering Order State";

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
