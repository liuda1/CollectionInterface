package com.akbar;

import java.util.*;

public class Set_Interface {
public static void main(String[] args) {
	//using for getting unique values, no duplicates, doesn't give you order
	Set <String> cities=new HashSet<>();
	cities.add("Baku");
	cities.add("Moscow");
	cities.add("Chisinau");
	cities.add("Baku");
	cities.add("Kiev");
	cities.remove("Moscow");
//	for (String city : cities) {
//		System.out.println(city);
//	}
	
	System.out.println("---------------------------");
	Iterator<String> iter=cities.iterator();
	while (iter.hasNext()){
		if (iter.next().equals("Baku")){
			iter.remove();
		}
		System.out.println(cities);
	}
	}
}
