package chap9;

import java.util.StringJoiner;

public class d1215_8_JoinTest {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5, 6};
		String arr2[] = new String[arr.length];
		for(int i = 0 ; i < arr.length;i++) {
			arr2[i] = String.valueOf(arr[i]);
			
			
		}
		System.out.println();
		System.out.println(String.join(" - ",  arr2));
		
		StringJoiner sj = new StringJoiner(" - ", "(", ")");
		for(int i = 0 ; i < arr.length; i++) {
			sj.add(String.valueOf(arr[i]));
		}
		System.out.println(sj);
		System.out.println(sj.toString());
	}

}
