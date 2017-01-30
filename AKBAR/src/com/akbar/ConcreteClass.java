package com.akbar;



public class ConcreteClass extends AbstractPr{
	public ConcreteClass(){
		System.out.println("constr concrete");
	}
	public static void main(String[] args) {
	

   ConcreteClass cl=new ConcreteClass();
    cl.Practice();


	}
public void Practice(){
	System.out.println("implemented");
}


    
}
