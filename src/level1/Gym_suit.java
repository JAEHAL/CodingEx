//체육복 문제
//에러 다시

package level1;

import java.util.Arrays;

public class Gym_suit {
	public static void main(String[] args) {
		
		int n = 6; //전체 학생 수
		int answer = 0;
		int[] lost = {1,3,4,5}; // 체육복을 도난당한 학생들의 번호가 담긴 배열
		int[] reserve = {1,4}; // 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열
		int num = 0; // 체육복이 있는 학생 수 판별하기 위한 변수 선언
		
		int[] std = new int[n]; // 전체 학생을 담는 배열
		
		//전체 학생의 체육복을 1나씩이라고 가정하고 배열에 담기
		for(int i=0; i<std.length; i++) {
			std[i] = 1;
		}
		System.out.println(Arrays.toString(std));
		
		// 여벌의 체육복을 가져온 학생 찾아서 +1 시키기
		for(int i=0; i<reserve.length; i++) {
			std[reserve[i]-1] += 1;
		}
		System.out.println(Arrays.toString(std)+" : 여벌의 체육복");
				
		// 도난당한 학생의 체육복 -1하기
		for(int i=0; i<lost.length; i++) {
			std[lost[i]-1] -= 1;
		}
		System.out.println(Arrays.toString(std)+" : 도난 당한 학생 체육복");
		
		//체육복 빌려주는 조건
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
		System.out.println(Arrays.toString(std)+" : 체육복을 빌려준 후 결과");
		
		//수업을 들을 수 있는 학생들 num에 +1
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
