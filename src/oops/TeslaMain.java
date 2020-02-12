package oops;

public class TeslaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tesla m70 = new Tesla();
		Tesla m85 = new Tesla();
		Tesla p85D = new Tesla();
		System.out.println("for TESLA model3 m70  ");
		m70.vno=3657687;
		m70.models= "model3";
		m70.price = 47872.00;
		m70.display();
		
		System.out.println(" for TESLA model5 m85");
		m85.vno =357289480;
		m85.models ="model5";
		m85.price =60000;
		m85.display();
		
		System.out.println("for TESLA model6 p85D");
		
		p85D.vno =466959836;
		p85D.models ="Model6";
		p85D.price = 78885.78;
		p85D.display();

	}

}
