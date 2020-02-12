package oops;

public class OopsDemo1 {


		//class is a collection of variable and method 
	//class is logical entity
		// class contain varaible and method
		int eId;
		String ename;
		double sal;
		int deptNum;
		String job;
		//variable is atribute
		//class method  is block of code which contains a logic 
		//do some functionality
		void display()
		{
			System.out.println(eId);
			System.out.println(ename);
			System.out.println(sal);
			System.out.println(deptNum);
			System.out.println(job);
		}
		
		//main method
		public static void main(String[] args) {
			//object is physical entity and it is instance of a class
			//creation of object for emp1
			OopsDemo1 emp1 = new  OopsDemo1();
			emp1.eId = 101;
			emp1.ename ="mengistu";
			emp1.sal = 65000;
			emp1.deptNum = 4;
			emp1.job = "Automation tester";
			emp1.display();
			
			 OopsDemo1 emp2 = new  OopsDemo1();
			emp2.eId = 568;
			emp2.ename ="Ankur";
			emp2.sal =200000;
		    emp2.deptNum = 568;
		    emp2.job ="capital one";
		    emp2.display();
			
			
			
			
			
			
		}

	}


