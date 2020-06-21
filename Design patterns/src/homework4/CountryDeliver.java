package homework4;

public class CountryDeliver implements Chain {

	private  Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		nextInChain = nextChain;
		
		

		
	}

	@Override
	public void delivery(Deliver request) {
		Context player = new Context("Hero");
		AvalableState avalableState = new AvalableState();
		PreaperingState prepState = new PreaperingState();
		
		
		prepState.applyState(player);
		
		State playerState = player.getState();
		String currentState = playerState.getState();
		prepState.applyState(player);
		System.out.println("currentState of Country Checkout: " + currentState);
	
		// TODO Auto-generated method stub
		if(request.getDeliveryTo() == "Country"){
			avalableState.applyState(player);
			System.out.println("currentState of Country Checkout: " + currentState);
			   
			
	
						             			
			        } else {						             			
			            nextInChain.delivery(request);					             			
			        }

	}

	
	
}
