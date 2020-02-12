
public class multiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[][] = {{100,200},{300,400},{500,600}};
		System.out.println("number of row" + a.length);
		System.out.println("number of row" + a[2].length);
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a[j].length; j++) {
				System.out.println( a[i][j]);
				
			}
		}
		System.out.println("enhance looping");
		for(int m[] : a) {
			//System.out.println(a);
			
			for(int r:m) {
				System.out.println(r);
			}
			
		}
		

	}

}
