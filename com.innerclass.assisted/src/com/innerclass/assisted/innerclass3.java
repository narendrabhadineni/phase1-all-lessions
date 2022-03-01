package com.innerclass.assisted;

abstract class AnonymousInnerClass {
	   public abstract void display();
	}

public class innerclass3 {
	
	
	public void main(String[] args) {
		
		AnonymousInnerClass i = new AnonymousInnerClass() {

		         public void display() {
		            System.out.println("Anonymous Inner Class");
		         }
		      };
		      i.display();
	}

	public void display() {
		System.out.println("Anonymous Inner Class");
		
	}
}


	
	
		
	
		

