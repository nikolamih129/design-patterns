package homework4;

public class IntenatDeliver implements Chain {

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
		
		
		avalableState.applyState(player);
		
		State playerState = player.getState();
		String currentState = playerState.getState();
		
		System.out.println("currentState of international Checkout: " + currentState);
	
		// TODO Auto-generated method stub
		if(request.getDeliveryTo() == "International"){
			
			prepState.applyState(player);
			String currentState1 = playerState.getState();
			System.out.println("currentState of international Checkout: " +currentState1 );
			   
			
	
						             			
			        } else {						             			
			            nextInChain.delivery(request);					             			
			        }

	}

}
