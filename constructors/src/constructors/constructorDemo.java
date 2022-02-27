package constructors;
	class Empno{
		int id;
		String name;

	void display() {
		System.out.println(id+" "+name);
		}
	}

	public class constructorDemo {

	public static void main(String[] args) {

		Empno e1=new Empno();
		Empno e2=new Empno();

		e1.display();
		e2.display();
		}
	}

	class Std{
		int id;
		String name;

		Std(int i,String n)
		{
		id=i;
		name=n;
		}

		void display() {
		System.out.println(id+" "+name);
		}
	public static void main(String[] args) {

		Std s1=new Std(1,"Ajay");
		Std s2=new Std(5,"Anjali");
		s1.display();
		s2.display();
			}
	}


