//ü���� ����
//���� �ٽ�

package codingEx;

import java.util.Arrays;

public class Gym_suit {
	public static void main(String[] args) {
		
		int n = 5; //��ü �л� ��
		int answer = 0;
		int[] lost = {2,4}; // ü������ �������� �л����� ��ȣ�� ��� �迭
		int[] reserve = {1,4}; // ������ ü������ ������ �л����� ��ȣ�� ��� �迭
		int lost_std = 0; // ü���� �Ҿ���� �л� ��
		
		int[] std = new int[n]; // ��ü �л��� ��� �迭
		
		//��ü �л��� ü������ 1�����̶�� �����ϰ� �迭�� ���
		for(int i=0; i<std.length; i++) {
			std[i] = 1;
		}
		System.out.println(Arrays.toString(std));
		
		// ������ ü������ ������ �л� ã�Ƽ� +1 ��Ű��
		for(int i=0; i<reserve.length; i++) {
			std[reserve[i]-1] += 1;
		}
		System.out.println(Arrays.toString(std));
				
		// �������� �л��� ü���� -1�ϱ�
		for(int i=0; i<lost.length; i++) {
			std[lost[i]-1] -= 1;
			lost_std += 1;
		}
		System.out.println(Arrays.toString(std));
		System.out.println(lost_std);
		
		//ü���� �����ִ� ����
		for(int i=0; i<std.length; i++) {
			if(std[i]==2) {
				if(i==0 && std[i+1]==0) {
					std[i+1] += 1;
					std[i] -= 1;
					lost_std -= 1;
				}
				else if(i==std.length-1 && std[std.length-2]==0) {
					std[i] -= 1;
					std[i-1] += 1;
					lost_std -= 1;
				}
				else if(i!=0 && i!=std.length-1 && std[i-1]==0) {
					std[i] -= 1;
					std[i-1] += 1;
					lost_std -= 1;
				}
				else if(i!=0 && i!=std.length-1 && std[i+1]==0) {
					std[i] -= 1;
					std[i+1] += 1;
					lost_std -= 1;
				}
			}
			
		}
		System.out.println(Arrays.toString(std)+"a");
		
		//ü������ �� �����ٶ�
		for(int i=0; i<std.length; i++) {
			if(std[i]==1 || std[i]==0) {
				if(std[i]==0) {
					
				}
			}
		}
//
//			if(std[i]==0) {
//				if(i==0 && std[i+1]==2) { // 1��° �л��� ü������ �������߰� �� ��° �л��� ������ ü������ �������� ��
//					std[i] += 1;
//					std[i+1] -= 1;
//					lost_std -= 1;
//					System.out.println(Arrays.toString(std)+"a");
//				}
//				else if((i==(std.length-1)) && std[std.length-2]==2) { // ������ �л� ü������ 0�̰�, �� �� �л��� 2���� ��
//					std[i] += 1;
//					std[i-1] -= 1;
//					lost_std -= 1;
//					System.out.println(Arrays.toString(std)+"b");
//				}
//				else if(i!=0 && i!=std.length-1 && std[i+1]==2) { // i�� 0�� �ƴϰ� ���� �л��� ü������ 2�� ��
//					std[i] += 1;
//					std[i+1] -= 1;
//					lost_std -= 1;
//					System.out.println(Arrays.toString(std)+"c");
//					System.out.println(lost_std);
//				}
//				else if(i!=0 && i!=std.length-1 && std[i-1]==2) { // i�� 0�� �ƴϰ� �� �л��� ü������ 2�� ��
//					std[i] += 1;
//					std[i-1] -= 1;
//					lost_std -= 1;
//					System.out.println(Arrays.toString(std)+"d");
//				}
//				else {
//					lost_std -= 1;
//					System.out.println(Arrays.toString(std)+"e");
//					System.out.println(lost_std+" f");
//				}
//			}
//
		
		//System.out.println(Arrays.toString(std));
		//System.out.println(lost_std);
		System.out.println(n);
		System.out.println(lost_std);
		answer = n - lost_std;
		
		System.out.println(answer);		
	}
}
