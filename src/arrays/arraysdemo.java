package arrays;

public class arraysdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//array is collection of element of the same data type
		/*2 type of arrays 
		 * 1)single dimensional
		 * 2)two/multi dimensional
		 * 
		 * */
		//single dimensional arrays
		//declare array
		//insert value into arrays
		//find the size of the array
		//read  values from an arrays
		//declare array
		int b[] = new int[5];//declared array with size 5 start index is 0
		//insert value into arrays
		 b[0]=  1;
		 b[1]=  2;
		 b[2]=  3;
		 b[3]=  4;
		 b[4]=  5;
		//find the size of the array
		 System.out.println("length of an array is "+ b.length);//print length of the size of the array
		//read  values from an arrays
		 System.out.println(b[1]);
		// System.out.println(b.);
		 
		 for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);
			
		}
	
		
	}

}
