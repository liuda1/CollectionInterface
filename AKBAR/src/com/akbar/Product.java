package com.akbar;

public class Product {
 private String name;
 private double price;
 
public Product() {
	
}
public Product(String name, double price) {
	this.name=name;
	this.price=price;
}
public String getName() {
	return name;
}
public double getPrice() {
	return price;
}

@Override
public String toString(){
	return name+"---"+price;
}
public void getDescription(){
	System.out.println("descriptions from product class");
}
}
 