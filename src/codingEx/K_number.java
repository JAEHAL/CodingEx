package codingEx;

import java.util.Arrays;

public class K_number {
	public static void main(String[] args) {
		
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		int[] answer = {};
		
		answer = new int[commands.length];
		//int[] new_array = Arrays.copyOfRange(array, 1, 5); // array ���� �迭(������ �迭 �̸�, ���縦 ������ �ε���, ������ ������ ���� ���� �ε���)
		for(int i=0; i<commands.length; i++) {
			int[] new_array = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(new_array);
			answer[i] = new_array[commands[i][2]-1];
			//System.out.println(Arrays.toString(answer));
			//System.out.println(Arrays.toString(new_array));
		}
		System.out.println(Arrays.toString(answer));
		
		//System.out.println(Arrays.toString(new_array));
		
		int new_length1 = commands[0][1] - commands[0][0] + 1; // array�迭 �ڸ� �� �� �迭
		int new_length2 = commands[1][1] - commands[1][0] + 1;
		int new_length3 = commands[2][1] - commands[2][0] + 1;
		
		/*
		 * System.out.println(new_length1); System.out.println(new_length2);
		 * System.out.println(new_length3);
		 */
		
		int[] array1 = new int[new_length1]; // ù ��° �ڸ� �迭
		int[] array2 = new int[new_length2]; // �� ��° �ڸ� �迭
		int[] array3 = new int[new_length3]; // �� ��° �ڸ� �迭
		
		//answer �迭�� ù ��° �� ��
		//for(int i=commands[0][0]-1; i<commands[0][1]; i++) { // (i=1; i<5; i++)
		/*
		 * for(int i=0; i<commands[0][1]; i++) { array1[i] = array[1]; }
		 */

		//System.out.println(array1.length);
		
		//array �迭 �ڸ���
		for(int i=commands[0][0]-1; i<commands[0][1]; i++) {
			
		}
		
		 
	}
}
