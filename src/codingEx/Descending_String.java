//문자열 내림차순으로 배치하기 문제

package codingEx;

import java.util.Arrays;

public class Descending_String {
	public static void main(String[] args) {
		String s = "AcdeaC";
		String answer = "";
		
		char[] s1 = new char[s.length()];
		
		for(int i=0; i<s1.length; i++) {
			s1[i] = s.charAt(i);
		}
		
		System.out.println(Arrays.toString(s1));
		Arrays.sort(s1);
		System.out.println(Arrays.toString(s1) + " 1");
		
		for(int i=s1.length-1; i<=0; i--) {
			for(int j=0; j<s1.length; j++) {
				System.out.println(s1[j] + " " + s1[i]);
				s1[j] = s1[i];
			}
		}
		System.out.println(Arrays.toString(s1) + " 2");
		System.out.println(answer);
	}
}
