package chap5;

public class d1208_3_ArrayTest {

	public static void main(String[] args) {
		
		int []arr = new int[5];
		System.out.println("arr배열의 길이 = " + arr.length);
		
		for(int i = 0; i < arr.length;i++) {
			System.out.print(arr[i] + " - ");
		}
		System.out.println();
		
		for(int i = 0; i < arr.length;i++) {
			arr[i] = (int)(Math.random() * 50) + 1;
			System.out.print(arr[i] + " - ");
		}
		System.out.println();
		
		int min = 1000;
		for(int i = 0 ; i < arr.length; i++){
			if(min > arr[i])
				min = arr[i];
		}
		
		System.out.println("최소값 : " + min);
		

	}

}
