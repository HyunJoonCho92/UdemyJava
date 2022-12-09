package test;

public class d1208_7_Test2 {

	public static void main(String[] args) {
		
		// 입력변수 (최소 5 ~ 최대 10개)
		// 45 89 100 23 234 567
		
		// 입력된 변수 갯수 오름차순 정렬 결과 출력
		
		int num = (int)(Math.random() * 5 + 5);
		
		System.out.println(num); //확인용
		
		//배열 생성, 값 입력
		int arr[] = new int[num];
		for(int i= 0 ; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 499 + 1);
		}
		
		// 확인용
		for(int i= 0 ; i < arr.length; i++) {
			System.out.print(arr[i] + " - ");
		}
		System.out.println();
		
		//오름차순 정렬
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}	
			}
		}
		
		// 출력
		for(int i= 0 ; i < arr.length; i++) {
			System.out.print(arr[i] + " - ");
		}

	}

}
