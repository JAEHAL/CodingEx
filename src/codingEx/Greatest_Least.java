// �ִ����� �ּҰ���� ����

package codingEx;

import java.util.Arrays;

public class Greatest_Least {
	public static void main(String[] args) {
		int n=3, m=5;
		int[] answer = new int[2];
		
		//��Ŭ���� ȣ���� Ǯ�̷� �ִ����� ���ϱ�
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
