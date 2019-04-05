//자릿수 더하기 문제

package codingEx;

public class Digit_Plus {
	public static void main(String[] args) {
		int n = 987;
		int answer = 0;
		
		String s1 = Integer.toString(n);
		//System.out.println(s1);
		
		//int n1 = Integer.parseInt(String.valueOf(s1.charAt(0)));
		//System.out.println(n1);
		
		for(int i=0; i<s1.length(); i++) {
			answer += Integer.parseInt(String.valueOf(s1.charAt(i)));
		}
		
		System.out.println(answer);
	}
}
