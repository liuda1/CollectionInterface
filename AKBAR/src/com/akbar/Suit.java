package com.akbar;

public class Suit extends Product{
  public Suit(String Sname, double Sprice) {
	super(Sname, Sprice);
}
  
  @Override
  public String toString(){
	  return "SuitName: "+getName()+" SiutPrice: "+getPrice();
  }
  
  @Override
  public void getDescription(){
 	 System.out.println("descriptions from suit class ");
 	
 	}
}
