// x��ŭ ������ �ִ� n���� ���� ����

package codingEx;

import java.util.Arrays;

public class X_Interval {
	public static void main(String[] args) {
		int x=-4;
		int n=2;
		long[] answer = new long[n];
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = x;
			x = (int)answer[0] + x; // �̷��� �ϴϱ� ���� ���ǿ� �ɷ��� ���� x // int x�� long������ �ٲ��ָ� ���� ����
		}
		
		System.out.println(Arrays.toString(answer));
	}
}
