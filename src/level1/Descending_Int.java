// 정수 내림차순으로 배치하기 문제

package level1;

import java.util.Arrays;

public class Descending_Int {
	public static void main(String[] args) {
		long n = 118372;
		long answer = 0;
		
		String s = "" + n;
		
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		//System.out.println(Arrays.toString(ch));
		
		String s2 = new String(ch);
		StringBuilder sb = new StringBuilder(s2);
		sb.reverse();
		//System.out.println(sb);
		
		String s3 = sb.toString();
		//System.out.println(s3);
		
		answer = Long.parseLong(s3);
		System.out.println(answer);
	}
}
