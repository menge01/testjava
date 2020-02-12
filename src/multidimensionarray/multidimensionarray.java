package multidimensionarray;

public class multidimensionarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b[][]= { {2,4},{6,8},{7,9}};
		System.out.println(b.length);
		System.out.println("column" +b[1].length);
		
		for (int i = 0; i < b.length; i++) {//i is row
			//System.out.println("outer loop for column"+i);
			for (int j = 0; j < b[j].length; j++) {// j is column
				System.out.println("the array element "+b[i][j]);
				
			}
			
		}
		for (int[] c : b) {
			System.out.println(c.length);
			
			for (int d : c) {
			
				System.out.println("for advance "+d);
				
			}
			
		}
	}

}
