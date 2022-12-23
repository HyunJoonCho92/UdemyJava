package chap15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class d1221_3_BufferedOutputTest {

	public static void main(String[] args) throws IOException {

		// 원본스트림
		FileOutputStream fos = new FileOutputStream("buffer.txt");
		
		// 보조스트림 - 메모리 복사
		BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
		for(int i = 48; i <= 57; i++) {
			bos.write(i);  //write(int) --> int 해당 문자 저장
		}
		
		bos.close();
		//fos.close();

	}
}