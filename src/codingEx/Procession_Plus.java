// 행렬의 덧셈 문제

package codingEx;

import java.util.Arrays;

public class Procession_Plus {
	public static void main(String[] args) {
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{5,6}};
		int[][] answer = new int[arr1.length][arr1[0].length];
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.println("i= " + i + " " + "j= " + j);
				System.out.println("arr1[i][j]= " + arr1[i][j] + " " + "arr2[i][j]= " + arr2[i][j]);
				answer[i][j] = arr1[i][j] + arr2[i][j];
				System.out.println("answer[i][j]= " + answer[i][j]);
			}
		}
		
		System.out.println(Arrays.deepToString(answer)); // 다차원 배열 출력할때는 deepToString method쓰기
	}
}
