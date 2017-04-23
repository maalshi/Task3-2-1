package Items;

public class Fan extends ElectricityItem {
	
	//constructor
	public Fan(String name, int power, int consumption) {
		super(name, power, consumption);
		// TODO Auto-generated constructor stub
	}

	//create new items
	public static Fan FanHuawei (){
		return new Fan("Huavei", 300, 400);
			}
	
	public static Fan FanSamsung (){
		return new Fan("Samsung", 350, 450);
			}
	
	
	//Override general for all items method 
	@Override
	public
	String working() throws Exception {
		
			return (super.working()+"Blowing off is in progress");
		
		

	}
	


	

}
