// 이상한 문자 만들기 문제

package codingEx;

import java.util.Arrays;

public class Strange_Text {
	public static void main(String[] args) {
		String s = "try hello world";
		String answer = "";
		
		char[] ch = s.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		for(int i=0; i<ch.length; i++) {
			if(i%2==0) {
				ch[i] = Character.toUpperCase(ch[i]);
			}
			else if(i%2 != 0) {
				ch[i] = Character.toLowerCase(ch[i]);
			}
		}
		answer = String.valueOf(ch);
		
		System.out.println(answer);
	}
}
