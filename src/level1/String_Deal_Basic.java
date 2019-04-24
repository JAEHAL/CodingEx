//문자열 다루기 기본 문제

package level1;

public class String_Deal_Basic {
	public static void main(String[] args) {
		String s = "1234";
		boolean answer = true;
		
		char temp;
		
		for(int i=0; i<s.length(); i++) {
			temp = s.charAt(i);
			if(s.length()==4 || s.length()==6) {
				//아스키코드 48~57까지가 숫자
				if((int)temp < 48 || (int)temp > 57) {
					answer = false;
				}
			}
			else {
				answer = false;
			}
		}
		
		System.out.println(answer);
	}
}
