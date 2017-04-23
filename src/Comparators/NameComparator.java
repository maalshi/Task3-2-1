package Comparators;

import java.util.Comparator;

import Items.ElectricityItem;



public class NameComparator implements Comparator <ElectricityItem> {

	@Override
	public int compare(ElectricityItem device1, ElectricityItem device2) {
		String name1 = device1.getName();
		String name2 = device2.getName();
		return name1.compareTo(name2);
	

	}

	

}
