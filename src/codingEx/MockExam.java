//모의고사 문제

package codingEx;

import java.util.Arrays;

public class MockExam {
	
	public static void main(String[] args) {
		
		int[] answer = {};
		int[] answers = {1,2,3,4,5};
		
		int[] std1 = {1,2,3,4,5}; // 1번 학생 찍는 순서
		int[] std2 = {2,1,2,3,2,4,2,5}; // 2번 학생 찍는 순서
		int[] std3 = {3,3,1,1,2,2,4,4,5,5}; // 3번 학생 찍는 순서
		
		int check1 = 0, check2 = 0, check3 = 0;
		
		for(int i=0; i<std1.length; i++ ) {
			if(std1[i] == answers[i]) {
				check1++;
			}
		}
		
		for(int j=0; j<std2.length; j++ ) {
			if(std2[j] == answers[j]) {
				check2++;
			}
		}
		
		for(int k=0; k<std3.length; k++ ) {
			if(std3[k] == answers[k]) {
				check3++;
			}
		}
		
		if(check1 > check2 & check3 < check1) {
			answer[0]=1;
		} else if(check1 < check2 & check3 < check2) {
			answer[0]=2;
		} else if(check1 < check3 & check3 > check2) {
			answer[0]=3;
		} else if(check1 == check2 & check1 > check3) {
			answer[0]=1;
			answer[1]=2;
		} else if(check2 == check3 & check1 < check2) {
			answer[0]=2;
			answer[0]=3;
		} else if(check1 == check3 & check1 > check2) {
			answer[0]=1;
			answer[1]=3;
		} else {
			answer[0]=1;
			answer[1]=2;
			answer[2]=3;
		}

		Arrays.sort(answer); // 오름차순 정렬
		
		System.out.println(Arrays.toString(answer)); // 정렬 출력
		
	}
	
}
