package inheritance;

class A{
	int a =10; 
	void display() {
		System.out.println(a);
	}
}
class B extends A {
	int b;
	void print() {
		System.out.println(b);
	}
	
}
class C extends B{
	int c;
	void show() {
		System.out.println(c);
	}
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       C cobj = new C();
		cobj.a =20;
		cobj.b =30;
		cobj.c =40;
		
		cobj.display();
		cobj.print();
		cobj.show();
		
	}

}
