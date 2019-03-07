package codingEx;

import java.util.Arrays;

public class K_number {
	public static void main(String[] args) {
		
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		int[] answer = {};
		
		answer = new int[commands.length];
		//int[] new_array = Arrays.copyOfRange(array, 1, 5); // array 복수 배열(복사할 배열 이름, 복사를 시작할 인덱스, 복사할 마지막 원소 다음 인덱스)
		for(int i=0; i<commands.length; i++) {
			int[] new_array = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(new_array);
			answer[i] = new_array[commands[i][2]-1];
			//System.out.println(Arrays.toString(answer));
			//System.out.println(Arrays.toString(new_array));
		}
		System.out.println(Arrays.toString(answer));
		
		//System.out.println(Arrays.toString(new_array));
		
		int new_length1 = commands[0][1] - commands[0][0] + 1; // array배열 자른 후 들어갈 배열
		int new_length2 = commands[1][1] - commands[1][0] + 1;
		int new_length3 = commands[2][1] - commands[2][0] + 1;
		
		/*
		 * System.out.println(new_length1); System.out.println(new_length2);
		 * System.out.println(new_length3);
		 */
		
		int[] array1 = new int[new_length1]; // 첫 번째 자른 배열
		int[] array2 = new int[new_length2]; // 두 번째 자른 배열
		int[] array3 = new int[new_length3]; // 세 번째 자른 배열
		
		//answer 배열에 첫 번째 들어갈 값
		//for(int i=commands[0][0]-1; i<commands[0][1]; i++) { // (i=1; i<5; i++)
		/*
		 * for(int i=0; i<commands[0][1]; i++) { array1[i] = array[1]; }
		 */

		//System.out.println(array1.length);
		
		//array 배열 자르기
		for(int i=commands[0][0]-1; i<commands[0][1]; i++) {
			
		}
		
		 
	}
}
