//문자열 내 마음대로 정렬하기 문제

package codingEx;

import java.util.Arrays;

public class String_sort {
	public static void main(String[] args) {
		String[] strings = {"sun","bed","car"};
		int n = 1;
		String[] answer = {};
		
		for(int i=0; i<strings.length; i++) {
			System.out.println(strings[i].length());
//			System.out.println(strings[i]);
		}
		
		System.out.println(Arrays.toString(answer));
	}
}
