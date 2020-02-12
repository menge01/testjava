package multidimensionarray;

public class MultiDimenstiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//rows and column
		int a [][] = new int [3][2];
		//int b[][]= {{2,4},{6,8},{7,9}};
		a[0][0]= 100; 
		a[0][1]= 200; 
		
		a[1][0]= 300; 
		a[1][1]= 400;
		        
		a[2][0]= 500; 
		a[2][1]= 600; 
		System.out.println("Number of rows " + a.length);
		System.out.println("Number of columns " + a[0].length);
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a[j].length; j++) {
				System.out.println(a[i][j]);
				
			}
			
		} 
		
		
		//for each loop 
				//first read the first row and column and save in r as single array
				// a read complete row and save in single dimension array
				for (int r[] : a) { //(100,200),(300,400)
					//we save in int variable i
					System.out.println(r[0]);
					for(int i:r) {
						System.out.println("for enhance for double dimesional array " + i);
					}
					
				
			
	}
		
		

	}

}
