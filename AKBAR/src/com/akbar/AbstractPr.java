package com.akbar;

public  abstract class AbstractPr{
  public AbstractPr(){
	  System.out.println("const");
  }
	public abstract void Practice();
	private int number;
	//public abstract void smth (int number);
	public void Another(){
		Practice();
		System.out.println("Non abstract");
	}
}
