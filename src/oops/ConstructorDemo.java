package oops;

public class ConstructorDemo {
	//default constructor is intialize(define ) value the
	int x ;
	int y;
	ConstructorDemo(){
		x =10;
		y = 20;
	}
	void display() {
		System.out.println(x+y);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cm1 = new ConstructorDemo();
		cm1.display();
		

	}

}
