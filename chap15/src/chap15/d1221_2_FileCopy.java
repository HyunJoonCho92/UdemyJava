package chap15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class d1221_2_FileCopy {
	
	// 1.(입력파일 없는 오류) a.txt b.txt --> a.txt 파일 없다.
	// 2. (출력파일 없으면 copy.txt 파일 자동생성) src/chap15/FileCopy.java copy.txt
	//  실행결과 새로 파일 생성 - refresh (또는 자동 refresh 설정)
	// 3. (다른 파일 복사 기존 파일 저장 삭제 후 출력) ../chap14/src/chap14/FileViewer.java copy.txt

	public static void main(String[] args) throws IOException{
		
		FileInputStream fis = new FileInputStream(args[0]);
		FileOutputStream fos = new FileOutputStream(args[1], true);//true이면 
		
		while( true ) {
			int data = fis.read(); //1byte만 활용
			if(data == -1) {
				break;
			}
			fos.write(data);
		}
			
		fis.close();
		fos.close();

	}
}