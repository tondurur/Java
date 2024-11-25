package Array;

public class MultyDimetionalArrayJaggedArray {

	
		public static void main(String[] args) {

			int [][] arr = new int[2][];
			
			arr[0] = new int [2];
			arr[1] = new int [2];
			
			arr[0][0] = 34;
			arr[0][1]=40;
			
			arr[1][0]= 45;
			arr[1][1]=34;
			
			for (int i=0; i<arr.length; i++) {
				for (int j=0; j<arr[i].length; j++) {
					System.out.print(arr[i][j]+ " ");
				}
			
			System.out.println();	
			}
			
		}

	}
