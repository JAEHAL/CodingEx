//���ǰ�� ����

package level1;

import java.util.Arrays;

public class MockExam {
	
	public static void main(String[] args) {
		
		int[] answer = {};
		int[] answers = {1,2,3,4,5};
		
		int[][] std = {
				{1,2,3,4,5}, // 1�� �л� �� ��� ����
				{2,1,2,3,2,4,2,5}, // 2�� �л� �� ��� ����
				{3,3,1,1,2,2,4,4,5,5} // 3�� �л� �� ��� ����
		};
		
		int[] check = new int[3]; // ���� ���� �ִ� �迭
		
		//�´� �� �� �л� ���� ���� //else if�� ���� �ϳ��� if���� ���̸� �������� �������� �ʾƼ� ��� if���� ���
		//i%5, i%8, i%10�� ������������ �̿��ؼ� ����迭�� ���� ũ�� ��ŭ �ݺ��ؼ� ������ ���� ���� �ִ� �迭�� check�迭�� 1�� ���ؼ� �־��ش�
		for(int i=0; i<answers.length; i++) {
			if(std[0][i%5] == answers[i]) {
				check[0] += 1;
				//System.out.println(Arrays.toString(check));
			}
			if(std[1][i%8] == answers[i]) {
				check[1] += 1;
				//System.out.println(Arrays.toString(check));
			}
			if(std[2][i%10] == answers[i]) {
				check[2] += 1;
				//System.out.println(Arrays.toString(check));
			}
		}
		
		//System.out.println(Arrays.toString(check));
		
		int max = check[0]; // max�� check[0]�̶�� ����
		//System.out.println(check[0]);
		
		if(max<check[1] && check[1]>check[2]) { //check[1]�� ���� ũ��
			answer = new int[1];
			answer[0] = 2;
		}
		else if(max<check[2] && check[2]>check[1]) { //check[2]�� ���� ũ��
			answer = new int[1];
			answer[0] = 3;
		}
		else if(max>check[1] && max>check[2]) { //check[0]�� ���� ũ��
			answer = new int[1];
			answer[0]=1;
		}
		else if(max==check[1] && check[1]>check[2]) { //check[0]�� check[1]�� ���� ũ��
			answer = new int[2];
			answer[0]=1;
			answer[1]=2;
		} 
		else if(max<check[1] && check[1]==check[2]) { //check[1]�� check[2]�� ���� ũ��
			answer = new int[2];
			answer[0]=2;
			answer[1]=3;
		}
		else if(max==check[2] && max>check[1]) { //check[0]�� check[2]�� ���� ũ��
			answer = new int[2];
			answer[0]=1;
			answer[1]=3;
		}
		else { // �� ���� ��� ������
			answer = new int[3];
			answer[0]=1;
			answer[1]=2;
			answer[2]=3;
		}
		
		System.out.println(Arrays.toString(answer));
		
	}	
}
