//ü���� ����
//���� �ٽ�

package level1;

import java.util.Arrays;

public class Gym_suit {
	public static void main(String[] args) {
		
		int n = 6; //��ü �л� ��
		int answer = 0;
		int[] lost = {1,3,4,5}; // ü������ �������� �л����� ��ȣ�� ��� �迭
		int[] reserve = {1,4}; // ������ ü������ ������ �л����� ��ȣ�� ��� �迭
		int num = 0; // ü������ �ִ� �л� �� �Ǻ��ϱ� ���� ���� ����
		
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
		System.out.println(Arrays.toString(std)+" : ������ ü����");
				
		// �������� �л��� ü���� -1�ϱ�
		for(int i=0; i<lost.length; i++) {
			std[lost[i]-1] -= 1;
		}
		System.out.println(Arrays.toString(std)+" : ���� ���� �л� ü����");
		
		//ü���� �����ִ� ����
		for(int i=0; i<std.length; i++) {
			if(std[i]==2) {
				if(i==0 && std[i+1]==0) {
					std[i+1] += 1;
					std[i] -= 1;
				}
				else if(i==std.length-1 && std[std.length-2]==0) {
					std[i] -= 1;
					std[i-1] += 1;
				}
				else if(i!=0 && i!=std.length-1 && std[i-1]==0) {
					std[i] -= 1;
					std[i-1] += 1;
				}
				else if(i!=0 && i!=std.length-1 && std[i+1]==0) {
					std[i] -= 1;
					std[i+1] += 1;
				}
			}
			
		}
		System.out.println(Arrays.toString(std)+" : ü������ ������ �� ���");
		
		//������ ���� �� �ִ� �л��� num�� +1
		for(int i=0; i<std.length; i++) {
			if(std[i] != 0) {
				num++;
			}
		}
		System.out.println(num);
		answer = num;
		System.out.println(answer);		
	}
}
