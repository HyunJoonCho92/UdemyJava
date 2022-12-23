package chap15;

import java.util.ArrayList;
import java.util.Scanner;

class Calculator{
	int su1, su2;
	String operator;
	
	public Calculator(int su1, int su2, String operator) {
		this.su1 = su1;
		this.su2 = su2;
		this.operator = operator;
	}

	@Override
	public String toString() {
		int result = 0;
		if(this.operator.equals("+")) {
			result = su1 + su2;
		}
		else if(this.operator.equals("-")) {
			result = su1 - su2;
		}
		else if(this.operator.equals("*")) {
			result = su1 * su2;
		}
		else if(this.operator.equals("/")) {
			result = su1 / su2;
		}
		return su1 + operator + su2 + "=" + result;
	}
}

public class d1221_7_CalcScannerTest {

	public static void main(String[] args) {
		
		ArrayList<String> menu = new ArrayList<String>();
		menu.add("덧셈");
		menu.add("뺄셈");
		menu.add("곱셈");
		menu.add("나눗셈");
		menu.add("프로그램종료");
		
		while(true) {
			System.out.println("계산기를 시작합니다. \n 종료하려면 q를 입력하세요. \n메뉴");
			
			for(int i = 0 ; i < menu.size(); i++) {
				System.out.println((i+1) + ". " + menu.get(i));
			}
			System.out.println("선택번호입력 : ");
			
			Scanner key = new Scanner(System.in);
			String num = key.next();
			
			if(num.equals("5") || num.equals("q") || num.equals("quit")   || num.equals("exit") ) {
				//return;//현재 메소드 종료
				//System.exit(0);//프로그램 종료
				break;
			}
			else {
				System.out.print(menu.get(Integer.parseInt(num)-1) + "할 데이터1 입력 : ");
				int first= key.nextInt();
				System.out.print(menu.get(Integer.parseInt(num)-1) + "할 데이터2 입력 : ");
				int second = key.nextInt();
				String operator = null;
				if(num.equals("1")) { operator = "+" ; }
				else if(num.equals("2")) { operator = "-" ; }
				else if(num.equals("3")) { operator = "*" ; }
				else if(num.equals("4")) { operator = "/" ; }
				Calculator calc= new Calculator(first, second, operator);
				System.out.println(calc);
			}
		}
	}
}
