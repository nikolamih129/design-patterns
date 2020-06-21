package homework4;

public class Main {
	

	public static void main(String[] args) {
		
		
		 Chain chainInt = new IntenatDeliver();
		
		         Chain ChainCount = new CountryDeliver();
		
		         Chain chainCity = new CityDeliver();
		
		         

		         
		        chainInt.setNextChain(ChainCount);
		        
		                 ChainCount.setNextChain(chainCity);
		        
		                 
		                 Deliver request = new Deliver("City");
		                
		                          
		               
		                         chainInt.delivery(request);

	}


}
