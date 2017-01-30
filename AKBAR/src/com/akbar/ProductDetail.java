package com.akbar;

public class ProductDetail {
	public static void sellProduct(Product product) {
		System.out.println(product.toString());
		
	}
public static void main(String[] args) {
//	Product product =new Product("TV",780.80);
//	System.out.println(product);
//	Shirt shirt =new Shirt("Shirt",100.8);
//	System.out.println(shirt);
//	Suit suit= new Suit("Suit", 430.6);
//	System.out.println(suit);
	
	Product s1=new Suit("suit1",43);
	sellProduct(s1);
	Product s2=new Shirt("shirt1",34);
	sellProduct(s2);
	Product s3=new Shirt("shirt2",23);
	sellProduct(s3);
	
	
}
}
