//문자열을 정수로 바꾸기 문제

package codingEx;

public class String_Integer {
	public static void main(String[] args) {
		String s = "-1234";
		int answer = 0;
		
		answer = Integer.parseInt(s);
		
		System.out.println(answer);
	}
}
