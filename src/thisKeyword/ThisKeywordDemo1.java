package thisKeyword;

public class ThisKeywordDemo1 {
	int a ,b;//instance variable
	void getvalues(int a,int b) {
		this.a=a;//this keyword separating a and b
		this.b=b;//when run particular variable
	}
	void printvalues() {
		System.out.println(a);
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordDemo1 th = new ThisKeywordDemo1();
		th.getvalues(100, 200);
		th.printvalues();
		
		//This is a reference variable in java refere a current object
	}

}
