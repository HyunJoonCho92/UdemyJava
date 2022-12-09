package test;

public class d1208_6_Test1 {

	public static void main(String[] args) {
		
//		    *
//		   ***
//		  *****
//		 *******
//		*********
		
		int input = 5;
		
		for(int i = 0 ; i < input;i++) {
			for(int j = input - 1; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
