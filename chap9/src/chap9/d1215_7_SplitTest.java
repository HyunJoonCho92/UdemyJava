package chap9;

import java.util.Arrays;

public class d1215_7_SplitTest {

	public static void main(String[] args) {
		//대한민국공공정보공개사이트 - 공공포탈api
		String address = "서울시-용산구;청파동:전자월드.3층?새싹아카데미";
		//String[] result = address.split(" ");
		String[] result = address.split("(:|;|-|==|\\.|\\?)"); //String 중간에 :, ;, -, ==, ., ? 가 있으면 나누기
		
		System.out.println(Arrays.toString(result));
	}

}