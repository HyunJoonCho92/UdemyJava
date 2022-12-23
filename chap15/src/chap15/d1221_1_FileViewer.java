package chap15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class d1221_1_FileViewer {
	

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			//FileInputStream fis = new FileInputStream("C:/Users/user/Desktop/Test2.txt");
			fis = new FileInputStream("c:/sba/workspace_java/chap15/src/chap15/d1221_1_FileViewer.java");
			
			while( true ) {
				int data = fis.read(); // 4byte 중 1byte만 활용
				if(data == -1) {
					break;
				}
				System.out.print((char)data);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("해당 파일은 존재하지 않습니다.");
		}
		catch(IOException e) {
			System.out.println("파일 입력 중 오류 발생했습니다.");
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			}
			catch(Exception e){
				
			}
		}

	}

}
