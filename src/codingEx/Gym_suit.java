//체육복 문제

package codingEx;

import java.util.Arrays;

public class Gym_suit {
	public static void main(String[] args) {
		
		int n = 5; //전체 학생 수
		int[] lost = {2,4}; // 체육복을 도난당한 학생들의 번호가 담긴 배열
		int[] reserve = {3}; // 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열
		
		int[] std = new int[n]; // 전체 학생을 담는 배열
		
		//전체 학생 수 배열에 담기
		for(int i=0; i<std.length; i++) {
			std[i] = n--;
		}
		
		Arrays.sort(std);
		//int[] std2 = Arrays.copyOf(std, 5); // std배열 복사 // 5를 n으로 했더니 안된다 
		// copyOf(?,?) 첫 ?는 원본 배열, 두번째 ?는 원본 배열에서 새로운 배열로 복사할 요소의 개수
		
		System.out.println(Arrays.toString(std));
		//System.out.println(Arrays.toString(std2));
		
		// 도난당한 학생들 학생 배열에서 빼기 // 도난당한 학생들을 찾아서 값을 0으로 만들기
		for(int j=0; j<lost.length; j++) {
			for(int z=0; z<std.length; z++) {
				if(std[z]==lost[j]) {
					std[z]=0;
				}
			}
		}
		System.out.println(Arrays.toString(std));
		
		// 여벌의 체육복을 가져온 학생의 번호를 찾아서 +1 시키기
		for(int k=0; k<reserve.length; k++) {
			for(int i=0; i<std.length; i++) {
				if(std[i]==reserve[k]) {
					std[i] += 1;
				}
			}
		}
		
		System.out.println(Arrays.toString(std));
		int answer = 0;
		//System.out.println(answer);
		
	}
}
