package test;

public class d12126_9_StringComparator {
	
	static int compare(String str1, String str2, boolean isLength) {
		if(isLength == true) {//true 일 때
			if(str1.length() > str2.length()) {
				return str1.length();
			}
			else {
				return str2.length();
			}
		}
		else {//false 일 때
			char c1 = 'a';
			char c2 = 'a';
			
			int count1 = 0;
			int count2 = 0;
			for(int i = 0; i < str1.length();i++) {
				if(c1 == str1.charAt(i)) {
					count1++;
				}
			}
			for(int i = 0 ; i < str2.length(); i++) {
				if(c2 == str2.charAt(i)) {
					count2++;
				}
			}
			if(count1 > count2) {
				return str1.length();
			}
			else {
				return str2.length();
			}
		}
	}
	
	static String deleteChar(String data, String str[]) {
		String temp = "";
		for(int i = 0 ; i < str.length; i++) {
			if(i == 0) {
				temp += str[i];
			}
			else {
				temp = temp + str[i];
			}
		}
		temp = "[" + temp + "]";
		System.out.println(temp);
		System.out.println("\"" + temp + "\"");
		
		String[] word = data.split(temp);
		
		String answer = "";
		
		for(int i = 0 ; i < word.length; i++) {
			answer += word[i];
		}
		
		return answer;
	}
	

	public static void main(String[] args) {
		
		//1. compare 메소드 
		int num1 = compare("javaprogram", "oracle", true); //11   
		int num2 = compare("javaprogram", "oracledatabase", false); //14
		System.out.println(num1);
		System.out.println(num2);

		//2.URL 입력받아서 분리 출력
		String url = "http://www.kitri.re.kr:8080/java/test";
		url = url.replace("http://", "");
		
		
		
		String[] words=url.split("\\.|:|/");
		String abc = "\\.|:|/";		
		System.out.println("--출력결과---");
		for(int i = 0 ; i < words.length; i++)
		{
			System.out.println(words[i]);
		}

		
		String data = "지금 저는 ㅋㅋㅋ 수업중입니다. 정말요? 과제물도 ㅎㅎㅎ 하고 있구요.";
		String delResult2 = deleteChar(data, new String[]{".", "ㅋ", "ㅎ","?", " "});
		System.out.println("===> " + delResult2);
		//===> 지금저는수업중입니다정말요과제물도하고있구요
	}

}
