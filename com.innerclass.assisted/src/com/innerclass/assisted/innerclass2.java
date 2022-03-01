package com.innerclass.assisted;

public class innerclass2 {
	
	public class AnonymousInnerClass {

	}

	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  
	 
		
			
		
		}
	



	
