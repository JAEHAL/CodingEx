// x만큼 간격이 있는 n개의 숫자 문제

package codingEx;

import java.util.Arrays;

public class X_Interval {
	public static void main(String[] args) {
		int x=-4;
		int n=2;
		long[] answer = new long[n];
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = x;
			x = (int)answer[0] + x; // 이렇게 하니까 제한 조건에 걸려서 답이 x // int x를 long형으로 바꿔주면 정답 가능
		}
		
		System.out.println(Arrays.toString(answer));
	}
}
