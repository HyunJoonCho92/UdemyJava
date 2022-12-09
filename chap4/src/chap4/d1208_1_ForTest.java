package chap4;

public class d1208_1_ForTest {

	public static void main(String[] args) {
		char star = '*';
		
		int count = (int)(Math.random() * 20) + 1;
		//count 만큼 반복 출력
		
		int lines = (int)(Math.random() * 10) + 1;
		
		System.out.println(lines + "줄에 " + count +" 만큼 출력합니다.");
		
		for(int j = 0 ; j < lines; j++) {
			for(int i = 0 ; i < count;i++) {
				System.out.print(star);
			}
			System.out.println();
		}
		
		System.out.println(lines +"줄 만큼 직각 삼각형 만들기");
		
		for(int i = 0 ; i < lines;i++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print(star);
			}
			System.out.println();
		}
	}
}