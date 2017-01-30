package com.akbar;

import java.util.*;

public class CollectionInterface {
public static void main(String[] args) {
	ArrayList<String> col=new ArrayList<>();
	Collection <String> col1= new ArrayList<>();
	List<String> col2=new ArrayList<>();
	col2.add("Kiev");
	col2.add("Lviv");
	col2.add("Tokyo");
	col2.add("NY");
	col2.add(0, "Rome");
	col2.remove("NY");
//	for (String cities : col2) {
//		System.out.println(cities);
//		 
//	}
	System.out.println(col2);
	Collections.reverse(col2);
	System.out.println(col2);
	col2.forEach(s -> System.out.println(s));
	System.out.println();
	
	
//	
//	for (int i = 0; i < col2.size(); i++) {
//		System.out.println(col2.get(i));
//	}
//	System.out.println();
//	Iterator <String> iter=col2.iterator();
//	while(iter.hasNext()){
//		System.out.println(iter.next());
//	}
	}
}
