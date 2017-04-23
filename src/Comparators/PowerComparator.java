package Comparators;

import java.util.Comparator;

import Items.ElectricityItem;


public class PowerComparator implements Comparator<ElectricityItem> {
	
	

	@Override
	public int compare(ElectricityItem e1, ElectricityItem e2) {
		// TODO Auto-generated method stub
		int power1=e1.getPower();
		int power2=e2.getPower();
		return e1.getPower()-e2.getPower();
	}

}
