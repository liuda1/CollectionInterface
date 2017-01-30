package com.akbar;

public class Shirt extends Product{
 public Shirt(String Shname, double Shprice) {
	super(Shname,Shprice);
	}
 
 @Override
 public String toString(){
 	return "Shirt name: "+getName()+" Shirt price: "+getPrice();
 }
 @Override
 public void getDescription(){
	 System.out.println("descriptions from shirt class ");
	
	}
}
