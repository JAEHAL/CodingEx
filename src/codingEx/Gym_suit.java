//ü���� ����

package codingEx;

import java.util.Arrays;

public class Gym_suit {
	public static void main(String[] args) {
		
		int n = 5; //��ü �л� ��
		int[] lost = {2,4}; // ü������ �������� �л����� ��ȣ�� ��� �迭
		int[] reserve = {3}; // ������ ü������ ������ �л����� ��ȣ�� ��� �迭
		
		int[] std = new int[n]; // ��ü �л��� ��� �迭
		
		//��ü �л� �� �迭�� ���
		for(int i=0; i<std.length; i++) {
			std[i] = n--;
		}
		
		Arrays.sort(std);
		//int[] std2 = Arrays.copyOf(std, 5); // std�迭 ���� // 5�� n���� �ߴ��� �ȵȴ� 
		// copyOf(?,?) ù ?�� ���� �迭, �ι�° ?�� ���� �迭���� ���ο� �迭�� ������ ����� ����
		
		System.out.println(Arrays.toString(std));
		//System.out.println(Arrays.toString(std2));
		
		// �������� �л��� �л� �迭���� ���� // �������� �л����� ã�Ƽ� ���� 0���� �����
		for(int j=0; j<lost.length; j++) {
			for(int z=0; z<std.length; z++) {
				if(std[z]==lost[j]) {
					std[z]=0;
				}
			}
		}
		System.out.println(Arrays.toString(std));
		
		// ������ ü������ ������ �л��� ��ȣ�� ã�Ƽ� +1 ��Ű��
		for(int k=0; k<reserve.length; k++) {
			for(int i=0; i<std.length; i++) {
				if(std[i]==reserve[k]) {
					std[i] += 1;
				}
			}
		}
		
		System.out.println(Arrays.toString(std));
		int answer = 0;
		//System.out.println(answer);
		
	}
}
