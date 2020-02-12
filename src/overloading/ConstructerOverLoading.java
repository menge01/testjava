package overloading;

public class ConstructerOverLoading {
	
	
	ConstructerOverLoading(int a,int b){
		System.out.println(a+b);
	}
	ConstructerOverLoading(int a,double b){
		System.out.println(a+b);
	}
	ConstructerOverLoading(double a,int b){
		System.out.println(a+b);
	}
	ConstructerOverLoading(int a,int b,int c){
		System.out.println(a+b+c);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructerOverLoading co = new ConstructerOverLoading(12,23);

	}

}
