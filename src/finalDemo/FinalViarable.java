package finalDemo;

public class FinalViarable {
	final int speed = 40;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalViarable fl = new FinalViarable();
      fl.speed = 100;
      System.out.println(fl.speed);
	}

}
