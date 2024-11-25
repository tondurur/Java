package Array;

public class MultyDimetionalArray {

	
		public static void main(String[] args) {
			
		

	int [][] arr = new int[2][2];
	arr[0][0] = 34;
	arr[0][1] =56;
	
	arr[1][0] = 96;
	arr[1][1]=56;
	
	for (int i =0; i<arr.length; i++) {
		for (int j=0; j<arr[i].length; j++) {
			
			System.out.print(arr[i][j]+ " ");
		}
		System.out.println();


	}
		}

}
