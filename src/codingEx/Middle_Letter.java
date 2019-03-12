//가운데 글자 가져오기 문제

package codingEx;

public class Middle_Letter {
	public static void main(String[] args) {
		String s = "abcde";
		String answer = "";
		
		int s1 = s.length()/2; // s문자의 반 인덱스
		
		if(s.length()%2 == 0) { // s문자열이 짝수 일 때
			String sub1 = s.substring(s1-1, s1+1);
			answer = sub1;
		}
		else if(s.length()%2 != 0) { // s문자열이 홀수 일 때
			String sub2 = s.substring(s1, s1+1);
			answer = sub2;
		}
	
		System.out.println(answer);
	}
}
