package Items;

public class Refrigirator extends ElectricityItem {
	
	
		
	//constructor
	public Refrigirator(String name, int power, int consumption) {
		super (name, power,consumption);
	}

	
	//create new items
	public static Refrigirator RefrigiratorAtlant (){
		return new Refrigirator("Atlant", 1000, 1200);
			}
	
	public static Refrigirator RefrigiratorNotAtlant (){
		return new Refrigirator("NotAtlant", 1050, 2050);
			}
	
	//Override general for all items method 
	@Override
	public
	String working() throws Exception {
		return (super.working()+"Freezing is in progress");

	}
	
	

}
