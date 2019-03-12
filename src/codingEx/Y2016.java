package codingEx;

import java.util.Calendar;

public class Y2016 {
	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		
		String answer = "";
		
		String[] day_week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		
		Calendar cal = Calendar.getInstance(); // Calendar가 추상 클래스여서 이와 같이 선언하고 시작
		//System.out.println(cal);
		
		/*
		 * Calendar.MONTH값은 0~11까지 존재 하며 각각의 값이 1월부터 12월을 의미하므로 현재 월을 구하기 위해서는 +1을 해줘야 한다. 
		 * Calendar.DAY_OF_WEEK는 요일을 의미. 1~7까지의 값을 리턴. 일~토까지를 의미.
		*/
		cal.set(2016, a-1, b); // Calendar 클래스를 2016년 5월 24일로 설정
		//월 -1이유는 값이 5일 경우 +1이 되어서 6월을 의미하므로 -1을 해준다.
		
		//int mon = cal.MONTH+1;
		//System.out.println(mon+"월");
		
		int ab=cal.get(Calendar.DAY_OF_WEEK)-1;
		
		answer = day_week[ab];
		
		System.out.println(answer);
		
	}
}
