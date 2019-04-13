// 최대공약수 최소공배수 문제

package codingEx;

import java.util.Arrays;

public class Greatest_Least {
	public static void main(String[] args) {
		int n=3, m=5;
		int[] answer = new int[2];
		
		//유클리드 호제법 풀이로 최대공약수 구하기
		if(n<m) {
			int tmp=n;
			n=m;
			m=tmp;
		}
		
		while(true) {
			if(n%m==0) {
				answer[0]=m;
				break;
			}
			else if(n%m!=0) {
				n=m;
				m=n%m;
			}
		}
		System.out.println(answer[0]);
		
		answer[1] = (n*m) / answer[0];
		System.out.println(Arrays.toString(answer));
	}
}
