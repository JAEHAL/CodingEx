//ü���� ����

package codingEx;

import java.util.Arrays;

public class Gym_suit {
	public static void main(String[] args) {
		
		int n = 5; //��ü �л� ��
		int[] lost = {2,4}; // ü������ �������� �л����� ��ȣ�� ��� �迭
		int[] reserve = {1,3,5}; // ������ ü������ ������ �л����� ��ȣ�� ��� �迭
		
		int[] std = new int[n]; // ��ü �л��� ��� �迭
		
		//��ü �л��� ü������ 1�����̶�� �����ϰ� �迭�� ���
		for(int i=0; i<std.length; i++) {
			std[i] = 1;
		}
		System.out.println(Arrays.toString(std));
		
		//������ ���ϱ� ���� �迭 ����
		//int[] std2 = Arrays.copyOf(std, std.length); // std�迭 ���� // 5�� n���� �ߴ��� �ȵȴ� //�׷��� std.length�� ��ü
		// copyOf(?,?) ù ?�� ���� �迭, �ι�° ?�� ���� �迭���� ���ο� �迭�� ������ ����� ���� 
		
		//System.out.println(Arrays.toString(std));
		//System.out.println(Arrays.toString(std2));
		
		// �������� �л��� ü���� -1�ϱ�
		for(int i=0; i<lost.length; i++) {
			std[lost[i]-1] -= 1;
		}
		System.out.println(Arrays.toString(std));
		
		// ������ ü������ ������ �л� ã�Ƽ� +1 ��Ű��
		for(int i=0; i<reserve.length; i++) {
			std[reserve[i]-1] += 1;
		}
		System.out.println(Arrays.toString(std));
		
		//ü���� �����ִ� ����
		for(int i=0; i<std.length; i++) {
			if(std[i]==0) {
				if(i==0 && std[i+1]==2) {
					std[i] += 1;
					std[i+1] -= 1;
				}
				
			}
		}
		 //int[] index = new int[reserve.length]; // ���� �迭�� ���ؼ� ���������� ū ���� �ε��� ���� �ֱ� ���ѹ迭 
		 // ���� �迭�� std2�迭 ���ؼ� ���� �迭 ������ ū ���� ��
//		 for(int i=0; i<reserve.length;i++) { 
//			 for(int j=0; j<std2.length; j++) { 
//				 if(std[j]<std2[j]) { 
//					index[i]=j;
//				 	//System.out.println("i= " + i + "j= " + j);
//				 } 
//			 } 
//		 }
		 //System.out.println(Arrays.toString(index));
		 
		
		//�ε��� �迭�� �־��� ������ �� or �쿡 +1�� ���� �ƴ� �����ʿ��� +1���� ���ʿ��� +1���� ����
		
		int answer = 0;
		//System.out.println(answer);
		
	}
}
