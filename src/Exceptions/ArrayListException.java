package Exceptions;

import java.util.ArrayList;

import Items.ElectricityItem;

public class ArrayListException {
	
	public static void Add(ArrayList<ElectricityItem> list, ElectricityItem item){
		
		int size = list.size();
		for (int i =0; i<size; i++){
			
		
		if (list.get(i).getName().equals(item.getName())){
			throw new IllegalArgumentException("The value is already in the list.");
		}
			
		}
		
		list.add(item);
		
	}

}