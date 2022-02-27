package medhods;

public class methodExecution {
	
public int multipynumber(int a,int b) {
	int z=a*b;
	return z;
		
	}
public static void main(String[] args) {
	
	methodExecution b=new methodExecution();
	int ans=b.multipynumber(10,3);
	System.out.println("Multiplication is="+ans);
	
}


		
		public static void main1(String args[])
		{
			overloadMethod ob=new overloadMethod();
			ob.area(10,12);
			ob.area(5, 0);
			System.out.println("Area of triangle is=");
			}
}
