package inheritance;

class A1 {//parent class
	int a;
	void display() {
		System.out.println(a);
	}
}
class B2 extends A1{//B is child class
   	int b;
   	void print () {
   		 System.out.println(b);
   	
   	}
}



public class InheritanceDemo1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A1 aobj = new A1();
        aobj.a = 100;
        aobj.display();
        B2 bobj = new B2();
        bobj.b = 200;
        bobj.a = 300;        
        bobj.display();
        bobj.print();
	}

}
