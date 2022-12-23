package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Student{
	String name;
	int kor;
	int math;
	int eng;
	int total;
	int avg;
	
	public Student(String name, int kor, int math, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.total = kor + math + eng;
		this.avg = (kor + math + eng) / 3;
	}
	
	
}

public class d1221_9_test1 {

	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("국어 : ");
		int kor = sc.nextInt();
		
		System.out.println("수학 : ");
		int math = sc.nextInt();
		
		System.out.println("영어 : ");
		int eng = sc.nextInt();
		
		Student s = new Student(name, kor, math, eng);
		
//		System.out.println(s.name + " " + s.kor + " " + s.math + " " + s.eng + " "
//				+ s.total + " " + s.avg);
		
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("test1.txt", true));
		bw.write(s.name + " " + s.kor + " " + s.math + " " + s.eng + " "
				+ s.total + " " + s.avg);
		bw.newLine();
		bw.close();
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("test1.txt"));
			String line = null;
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(br != null) {
				br.close();
			}
		}
		
		
		
		
		
		

	}

}
