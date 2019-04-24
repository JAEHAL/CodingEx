// 자연수 뒤집어 배열로 만들기 문제

package level1;

import java.util.Arrays;

public class Natural_Reverse {
	public static void main(String[] args) {
		long n = 12345;
		int[] answer = {};
		
		String s1 = String.valueOf(n);
		String[] s_Array = new String[s1.length()];
		
		for(int i=s1.length()-1; i>=0; i--) {
			s_Array[(s1.length()-1)-i] = String.valueOf(s1.charAt(i));
		}
		
		//String배열을 int배열로 변환하는 작업
		answer = Arrays.stream(s_Array).mapToInt(Integer::parseInt).toArray();
		
		System.out.println(Arrays.toString(answer));
		
	}
}
