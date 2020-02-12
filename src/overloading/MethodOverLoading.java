package overloading;

public class MethodOverLoading {

	//method overloading that allows to have more method having the same name with different parameter
		
		 void add(int a,int b) {
			 System.out.println(a+b);
		 }
		 void add(int a,double b) {
			 System.out.println(a+b);
		 }
		 void add(double a,double b) {
			 System.out.println(a+b);
		 }
		 void add(int a,int b,int c) {
			 System.out.println(a+b+c);
		 }
		 public static void main(String[] args) {
			 MethodOverLoading mo = new MethodOverLoading();
			 mo.add(2, 3);
			 mo.add(6, 30.566);
			 mo.add(12.23, 23.37);
			 mo.add(2, 3, 6);
			 
			
		}

	

}
