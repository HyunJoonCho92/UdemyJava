package chap10;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class d1216_7_FormatTest {

	public static void main(String[] args) {
		
		double d = 3.14 * 10;
		System.out.println(d);
		
		//# - 1자리 10진수. 0 표시안함
		//0 - 1자리 10진수. 0 표시
		//DecimalFormat df = new DecimalFormat("##.#");
		//DecimalFormat df = new DecimalFormat("000.00");
		//DecimalFormat df = new DecimalFormat("000.00+;000.00-");
		//DecimalFormat df = new DecimalFormat("###.00+;000.00-");
		
		DecimalFormat df = new DecimalFormat("##,###.00");
		String dStr = df.format(d);
		System.out.println(dStr);
		
		// -----------------------------------
		/* y-연도  M-월 d-일(월) D(연도) H-24시간 m-분 s-초 E-요일*/
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/ DDD (1년 중 몇번째일) / HH-mm-ss E요일");
		
		Calendar date = Calendar.getInstance();
		String dateStr = sdf.format(date.getTime());
		System.out.println(dateStr);
		
		//---------------------------------------
//		데이터 입력 - 2023 1 2 3 4 5
//		2023년 1월2일 3시 4분 5초 Calendar로 생성
//		1년 중 몇주(w)째인지 출력
//		해당월의 몇주(W)째인지 출력
//		요일(E) 출력
		
		if(args.length < 6) {
			return;
		}
		
		int [] argsInt  = new int[args.length];
		for(int i = 0 ; i < args.length; i++) {
			argsInt[i] = Integer.parseInt(args[i]);
		}
		Calendar date2 = Calendar.getInstance();
		date2.set(argsInt[0], argsInt[1]-1, argsInt[2], argsInt[3], argsInt[4], argsInt[5]);
		SimpleDateFormat sdf2 = new SimpleDateFormat
				("yyyy 년도의 w번재 주이고 MM 월의 W번째 주입니다. E 요일입니다.");
		
		System.out.println(sdf2.format(date2.getTime()));
		

	}

}
