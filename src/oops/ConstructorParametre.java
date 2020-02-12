package oops;

public class ConstructorParametre {
	int x ;
	int y ;
	
	ConstructorParametre(int a,int b){
		x =a;
		y = b;
		
	}
	void display() {
		System.out.println(x+y);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorParametre con1 = new ConstructorParametre(2, 5);
		con1.display();

	}

}
