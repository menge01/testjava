package oops;

public class Constructor {

	int sid ;
	String sname;
	char grade;
	
//	constructor is special method 
	Constructor(int id, String name,char g){
		sid = id;
		sname = name;
		grade = g;
		
	} 
	void display() {
		System.out.println(sid+ " " + sname+ " " +grade );
	}

}
