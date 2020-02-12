package overriding;
//we can not change the difinition like method name 
//parametre,only body is modify in the child body

class Bank{
	double rateOfInterest() {
		return 0;
	}
}
class City extends Bank{
	double rateOfInterest(){
		return 10.5;
	}
}
class bofa extends Bank{
	double rateOfInterest(){
		return 5.5;
	}
	
}
class cp1 extends Bank{
	double rateOfInterest(){
		return 22.5;
	}
}
public class OverRidingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City ct = new City();
		System.out.println(ct.rateOfInterest());
		
		bofa bf = new bofa();
		System.out.println(bf.rateOfInterest());
		
		cp1 cp = new cp1();
		System.out.println(cp.rateOfInterest());
		
	}

}
