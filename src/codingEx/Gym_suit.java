//체육복 문제

package codingEx;

import java.util.Arrays;

public class Gym_suit {
	public static void main(String[] args) {
		
		int n = 5; //전체 학생 수
		int[] lost = {2,4}; // 체육복을 도난당한 학생들의 번호가 담긴 배열
		int[] reserve = {1,3,5}; // 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열
		
		int[] std = new int[n]; // 전체 학생을 담는 배열
		
		//전체 학생 수 배열에 담기
		for(int i=0; i<std.length; i++) {
			std[i] = n--;
		}
		
		Arrays.sort(std);
		
		//원본과 비교하기 위한 배열 복사
		int[] std2 = Arrays.copyOf(std, std.length); // std배열 복사 // 5를 n으로 했더니 안된다 //그래서 std.length로 대체
		// copyOf(?,?) 첫 ?는 원본 배열, 두번째 ?는 원본 배열에서 새로운 배열로 복사할 요소의 개수 
		
		System.out.println(Arrays.toString(std));
		//System.out.println(Arrays.toString(std2));
		
		// 도난당한 학생들 학생 배열에서 빼기 // 도난당한 학생들을 찾아서 값을 0으로 만들기
		for(int j=0; j<lost.length; j++) {
			for(int z=0; z<std2.length; z++) {
				if(std2[z]==lost[j]) {
					std2[z]=0;
				}
			}
		}
		System.out.println(Arrays.toString(std2));
		
		// 여벌의 체육복을 가져온 학생의 번호를 찾아서 +1 시키기
		for(int k=0; k<reserve.length; k++) {
			for(int i=0; i<std2.length; i++) {
				if(std2[i]==reserve[k]) {
					std2[i] += 1;
				}
			}
		}
		System.out.println(Arrays.toString(std2));
		
		//reserve에 세 개의 값이 있으면 마지막 j의 값이 다 담김 -> 수정해야함
		/*
		 * int[] index = new int[reserve.length]; // 원본 배열과 비교해서 원본값보다 큰 값의 인덱스 값을 넣기 위한
		 * 배열 // 원본 배열과 std2배열 비교해서 원본 배열 값보다 큰 숫자 비교 for(int i=0; i<reserve.length;
		 * i++) { for(int j=0; j<std2.length; j++) { if(std[j]<std2[j]) { index[i]=j;
		 * System.out.println("i= " + i + "j= " + j); } } }
		 * System.out.println(Arrays.toString(index));
		 */
		
		//인덱스 배열에 넣어진 값으로 좌 or 우에 +1씩 줄지 아님 오른쪽에만 +1할지 왼쪽에만 +1할지 조건
		
		int answer = 0;
		//System.out.println(answer);
		
	}
}
