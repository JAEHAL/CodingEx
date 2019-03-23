//문자열 내림차순으로 배치하기 문제

package codingEx;

import java.util.Arrays;

public class Descending_String {
	public static void main(String[] args) {
		//String s = "AcdeaC";
		String s = "Zbcdefg";
		String answer = "";
		
		char[] s1 = s.toCharArray(); // 문자열을 char로 변환하는 방법
		char[] s2 = new char[s.length()]; // s1에 담은 배열값들을 거꾸로 담기 위한 배열 선언
		
		System.out.println(Arrays.toString(s1));
		Arrays.sort(s1);
		System.out.println(Arrays.toString(s1) + " 1");
		
		for(int i=s1.length-1; i>=0; i--) {
			//System.out.println(i);
			s2[(s1.length-1)-i] = s1[i];
		}
		
		System.out.println(Arrays.toString(s2) + " 2");
		answer = String.valueOf(s2); // char 배열을 문자열로 변환하는 방법
		// char 배열을 문자열로 변환하는 다른 방법
		/*
		 * answer = new String(s2);
		*/
		
		System.out.println(answer);
	}
}
