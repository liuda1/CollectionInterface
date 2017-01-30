 
package com.akbar;

import java.util.*;
import java.util.Map.Entry;

public class Map_Interface {
public static void main(String[] args) {
	//doesn't have order, keys should be unique,values can be duplicated
	Map <String, Integer>phones=new HashMap<>();
	phones.put("Mila", 98232433);
	phones.put("Jenia", 2834732);
	phones.put("Yerlan", 77398274);
	phones.put("Mila",1263584);
	//last one will override the first one
	
	Iterator <String> iterator=phones.keySet().iterator();
	while (iterator.hasNext()){
		String key=iterator.next();
		Integer value=phones.get(key);
		System.out.println(key+" "+value);
	}
	
	//store keys in Set
	Set<String> keys=phones.keySet();
	for (String key : keys) {
		System.out.println(key);
	}
	//store values in Collection
    Collection <Integer> val=phones.values();
    for (Integer values : val) {
    	System.out.println(values);
		
	}
    
    Set<Entry<String,Integer>> entry=phones.entrySet();
    for (Entry<String, Integer> entry2 : entry) {
		//System.out.println(entry2);
		System.out.println(entry2.getKey()+" "+entry2.getValue());
	}
}
}
