package codingEx;

public class K_number {
	public static void main(String[] args) {
		
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		int[] answer = {};
		
		int[] array1 = new int[commands[0][1]-1]; // 첫 번째 자른 배열
		int[] array2 = new int[commands[1][1]-1]; // 두 번째 자른 배열
		int[] array3 = new int[commands[2][1]-1]; // 세 번째 자른 배열
		
		//answer 배열에 첫 번째 들어갈 값
		//for(int i=commands[0][0]-1; i<commands[0][1]; i++) { // (i=1; i<5; i++)
		/*
		 * for(int i=0; i<commands[0][1]; i++) { array1[i] = array[1]; }
		 */

		//System.out.println(array1.length);
		
		/*
		 * for(int i=0; i<array1.length; i++) { array1[i] = array[]; }
		 */
		
	}
}
