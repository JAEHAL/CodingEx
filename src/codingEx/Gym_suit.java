//ü���� ����

package codingEx;

import java.util.Arrays;

public class Gym_suit {
	public static void main(String[] args) {
		
		int n = 5; //��ü �л� ��
		int[] lost = {2,4}; // ü������ �������� �л����� ��ȣ�� ��� �迭
		int[] reserve = {1,3,5}; // ������ ü������ ������ �л����� ��ȣ�� ��� �迭
		
		int[] std = new int[n]; // ��ü �л��� ��� �迭
		
		//��ü �л� �� �迭�� ���
		for(int i=0; i<std.length; i++) {
			std[i] = n--;
		}
		
		Arrays.sort(std);
		
		//������ ���ϱ� ���� �迭 ����
		int[] std2 = Arrays.copyOf(std, std.length); // std�迭 ���� // 5�� n���� �ߴ��� �ȵȴ� //�׷��� std.length�� ��ü
		// copyOf(?,?) ù ?�� ���� �迭, �ι�° ?�� ���� �迭���� ���ο� �迭�� ������ ����� ���� 
		
		System.out.println(Arrays.toString(std));
		//System.out.println(Arrays.toString(std2));
		
		// �������� �л��� �л� �迭���� ���� // �������� �л����� ã�Ƽ� ���� 0���� �����
		for(int j=0; j<lost.length; j++) {
			for(int z=0; z<std2.length; z++) {
				if(std2[z]==lost[j]) {
					std2[z]=0;
				}
			}
		}
		System.out.println(Arrays.toString(std2));
		
		// ������ ü������ ������ �л��� ��ȣ�� ã�Ƽ� +1 ��Ű��
		for(int k=0; k<reserve.length; k++) {
			for(int i=0; i<std2.length; i++) {
				if(std2[i]==reserve[k]) {
					std2[i] += 1;
				}
			}
		}
		System.out.println(Arrays.toString(std2));
		
		//reserve�� �� ���� ���� ������ ������ j�� ���� �� ��� -> �����ؾ���
		/*
		 * int[] index = new int[reserve.length]; // ���� �迭�� ���ؼ� ���������� ū ���� �ε��� ���� �ֱ� ����
		 * �迭 // ���� �迭�� std2�迭 ���ؼ� ���� �迭 ������ ū ���� �� for(int i=0; i<reserve.length;
		 * i++) { for(int j=0; j<std2.length; j++) { if(std[j]<std2[j]) { index[i]=j;
		 * System.out.println("i= " + i + "j= " + j); } } }
		 * System.out.println(Arrays.toString(index));
		 */
		
		//�ε��� �迭�� �־��� ������ �� or �쿡 +1�� ���� �ƴ� �����ʿ��� +1���� ���ʿ��� +1���� ����
		
		int answer = 0;
		//System.out.println(answer);
		
	}
}
