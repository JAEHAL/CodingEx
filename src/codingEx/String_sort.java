//문자열 내 마음대로 정렬하기 문제

package codingEx;

import java.util.Arrays;

public class String_sort {
	public static void main(String[] args) {
		String[] strings = {"abce","abcd","cda"};
		int n = 2;
		
		String[] answer = new String[strings.length];
		
		String[] num = new String[strings.length]; // 인덱스 n번째 문자 값 넣기 위한 배열
		
		// 인덱스 n번째 문자
		for(int i=0; i<strings.length; i++) {
			num[i] = strings[i].substring(n);
		}
		System.out.println(Arrays.toString(num));
		
		Arrays.sort(num);
		
		System.out.println(Arrays.toString(num));
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<strings.length; j++) {
//				System.out.println(num[i] + " " + strings[j].substring(n));
				if(num[i] == strings[j].substring(n)) {
					answer[i] = strings[j];
				}
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}
}
