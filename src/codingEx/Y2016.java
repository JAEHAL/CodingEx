package codingEx;

import java.util.Calendar;

public class Y2016 {
	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		
		String answer = "";
		
		String[] day_week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		
		Calendar cal = Calendar.getInstance(); // Calendar�� �߻� Ŭ�������� �̿� ���� �����ϰ� ����
		//System.out.println(cal);
		
		/*
		 * Calendar.MONTH���� 0~11���� ���� �ϸ� ������ ���� 1������ 12���� �ǹ��ϹǷ� ���� ���� ���ϱ� ���ؼ��� +1�� ����� �Ѵ�. 
		 * Calendar.DAY_OF_WEEK�� ������ �ǹ�. 1~7������ ���� ����. ��~������� �ǹ�.
		*/
		cal.set(2016, a-1, b); // Calendar Ŭ������ 2016�� 5�� 24�Ϸ� ����
		//�� -1������ ���� 5�� ��� +1�� �Ǿ 6���� �ǹ��ϹǷ� -1�� ���ش�.
		
		//int mon = cal.MONTH+1;
		//System.out.println(mon+"��");
		
		int ab=cal.get(Calendar.DAY_OF_WEEK)-1;
		
		answer = day_week[ab];
		
		System.out.println(answer);
		
	}
}
