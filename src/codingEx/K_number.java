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
		}
		System.out.println(Arrays.toString(answer));
	}
}