// ���� ����

package codingEx;

import java.util.Arrays;

public class Budget {
	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		int answer = 0;
		
		Arrays.sort(d);
		for(int i=0; i<d.length; i++) {
			if(budget-d[i] >= 0) {
				budget -= d[i];
				answer++;
			}
		}
		
		System.out.println(answer);
	}
}