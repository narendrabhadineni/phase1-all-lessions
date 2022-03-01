package com.abc;

 class abc {
	 int id;
		String name;
		abc(int i,String n)
		{
		id=i;
		name=n;
		}
		void display() 
		{
		System.out.println(id+" "+name);
		}
		}
	public class ParConstructor {

		public static void main(String[] args) {
			abc std1=new abc(7,"sai");
			abc std2=new abc(25,"hari");
			std1.display();
			std2.display();

		}

	}
}
