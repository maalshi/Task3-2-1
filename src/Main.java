import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import Comparators.NameComparator;
import Comparators.PowerComparator;
import Items.ElectricityItem;
import Items.Fan;
import Items.Refrigirator;
import Items.VacuumCleaner;



public class Main {
	   

		

		public static void main(String[] args) throws IOException {
		
		
		ArrayList<ElectricityItem> list = new ArrayList<ElectricityItem>();
		//ArrayListException: if item is present in list, message that the item is already in the list will be shown
		try{
			
		
		VacuumCleaner vacuumCleanerSamsung=VacuumCleaner.VacuumCleanerSamsung(); //create an object for one of the items
		vacuumCleanerSamsung.turnOn();											//turn on this object
		//ArrayListExtenstion.Add(list, vacuumCleanerSamsung);  									  // add turned on object t collection
		list.add(VacuumCleaner.VacuumCleanerLG()); 							//add turned off object to collection
		list.add(Refrigirator.RefrigiratorAtlant());						//add turned off object to collection
		Refrigirator refrigirator = Refrigirator.RefrigiratorNotAtlant();	
		refrigirator.turnOn();
		list.add(refrigirator);
		list.add(Fan.FanHuawei());
		list.add(Fan.FanSamsung());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		//show status of the electroitems, it turned on -perform work
		for(int i=0;i<list.size(); i++)
		{
			ElectricityItem item=list.get(i);
			if (item.getTurnedOn()==true)
			//TurnOnException: if item is not switched on, error message will be shown
				try {
					System.out.println(item.working());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			
		}
		
		//count sum of consumption
		int sum=0;
		for(int i=0;i<list.size(); i++)
		{
			ElectricityItem item=list.get(i);
			if (item.getTurnedOn()==true)
			{
				sum+=item.getConsumption();
			}
		}
		
		System.out.println(sum);
		
		//exception, when power is less than 0
		try {
			list.get(0).setPower(-3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		//exception, when consumption is less than 0
		try {
		list.get(0).setConsumption(-5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
		//sorting according to power
		Collections.sort(list, new PowerComparator());
		System.out.println("Sorting according to Power in ascending order:");
		for (int i =0; i<list.size();i++){
			System.out.println(list.get(i).getPower() + " " + list.get(i).getName()+ " " + list.get(i).getConsumption());
		}
				
		
		//sorting according to name
		Collections.sort(list, new NameComparator());
		System.out.println("Sorting according to Name in ascending order:");
		for (int i =0; i<list.size();i++){
			System.out.println(list.get(i).getName() + " " + list.get(i).getPower() + " " + list.get(i).getConsumption());
		}
		
		
		//searching according to entered parameters
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter min power, min consumption");
			   int minPower= sc.nextInt();
			   int minConsumption= sc.nextInt();
		
		sc.close();
		
		int size=list.size();
		for (int i =0; i<size;i++){
			ElectricityItem item = list.get(i);
			if (item.getPower()>=minPower && item.getConsumption()>= minConsumption){
				System.out.println(item);
			}
		}
		
		
		
		String  nameLabel="name= ";
		String  powerLabel=" power= ";
		String  consumptionLabel=" consumption= ";
		try(FileWriter writer = new FileWriter("C:\\nam.txt", false)) {
			  
			for (int i=0; i<list.size(); i++ ){
				
			
			  writer.write(nameLabel+ list.get(i).getName()+ powerLabel+ list.get(i).getPower()+consumptionLabel+ list.get(i).getConsumption());
			  writer.append("\r\n");
			}
			  
			  
			  writer.flush();
			  
			  }
			  catch (IOException ex){
			   System.out.println (ex.getMessage());
			  }

		
	}
}


		
		
		
		
		
		

		

		

	
