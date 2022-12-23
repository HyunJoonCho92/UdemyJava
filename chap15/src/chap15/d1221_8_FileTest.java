package chap15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class d1221_8_FileTest {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("파일이나 디렉토리명을입력하세요.");
		String input = sc.nextLine();
		File f = new File(input);
		
		if(!f.exists()) {
			System.out.println("파일이나 디렉토리 존재하지 않습니다.");
			return;
		}
		
		if(f.isFile()) {
			System.out.println("파일명 = " + f.getName());
			System.out.println("파일경로1 = " + f.getAbsolutePath());
			System.out.println("파일경로2 = " + f.getCanonicalPath());
			System.out.println("파일크기(byte) = " + f.length());
			Date d = new Date(f.lastModified());
			SimpleDateFormat sdf = new SimpleDateFormat("MM월 dd일 hh시 mm분 ss초 yyyy년도");
			String dStr = sdf.format(d);
			System.out.println("파일수정시각 = " + dStr);
			System.out.println("파일읽기여부 = " + f.canRead());
			System.out.println("파일쓰기여부 = " + f.canWrite());
		}
		else {
			File[] details2 = f.listFiles();
			for(File s2 : details2) {
				System.out.println(
						s2.isDirectory() ? "{" + s2.getName() + "}" : "(" + s2.getName() + ")"
						);
			}
		}

	}

}
