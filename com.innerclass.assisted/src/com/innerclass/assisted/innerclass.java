package com.innerclass.assisted;

public class innerclass {

		 private String msg="Welcome to Java"; 
		 
		 class Inner{  
		  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
		 }  


		public static void main(String[] args) {

			innerclass obj=new innerclass();
			innerclass.Inner in=obj.new Inner();  
			in.hello();  
			
			System.out.println();
		
				innerclass2  ob=new innerclass2 ();  
				ob.display();  
				
			System.out.println();
			
				innerclass3 ob1=new innerclass3();
				ob1.display();
				}

		
		}


	



		


