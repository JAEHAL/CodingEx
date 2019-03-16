//체육복 문제
//에러 다시

package codingEx;

import java.util.Arrays;

public class Gym_suit {
	public static void main(String[] args) {
		
		int n = 5; //전체 학생 수
		int answer = 0;
		int[] lost = {2,4}; // 체육복을 도난당한 학생들의 번호가 담긴 배열
		int[] reserve = {1,4}; // 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열
		int lost_std = 0; // 체육복 잃어버린 학생 수
		
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
		System.out.println(Arrays.toString(std));
				
		// 도난당한 학생의 체육복 -1하기
		for(int i=0; i<lost.length; i++) {
			std[lost[i]-1] -= 1;
			lost_std += 1;
		}
		System.out.println(Arrays.toString(std));
		System.out.println(lost_std);
		
		//체육복 빌려주는 조건
		for(int i=0; i<std.length; i++) {
			if(std[i]==2) {
				if(i==0 && std[i+1]==0) {
					std[i+1] += 1;
					std[i] -= 1;
					lost_std -= 1;
				}
				else if(i==std.length-1 && std[std.length-2]==0) {
					std[i] -= 1;
					std[i-1] += 1;
					lost_std -= 1;
				}
				else if(i!=0 && i!=std.length-1 && std[i-1]==0) {
					std[i] -= 1;
					std[i-1] += 1;
					lost_std -= 1;
				}
				else if(i!=0 && i!=std.length-1 && std[i+1]==0) {
					std[i] -= 1;
					std[i+1] += 1;
					lost_std -= 1;
				}
			}
			
		}
		System.out.println(Arrays.toString(std)+"a");
		
		//체육복을 못 빌려줄때
		for(int i=0; i<std.length; i++) {
			if(std[i]==1 || std[i]==0) {
				if(std[i]==0) {
					
				}
			}
		}
//
//			if(std[i]==0) {
//				if(i==0 && std[i+1]==2) { // 1번째 학생의 체육복이 도난당했고 두 번째 학생이 여벌의 체육복을 가져왔을 때
//					std[i] += 1;
//					std[i+1] -= 1;
//					lost_std -= 1;
//					System.out.println(Arrays.toString(std)+"a");
//				}
//				else if((i==(std.length-1)) && std[std.length-2]==2) { // 마지막 학생 체육복이 0이고, 그 전 학생이 2개일 때
//					std[i] += 1;
//					std[i-1] -= 1;
//					lost_std -= 1;
//					System.out.println(Arrays.toString(std)+"b");
//				}
//				else if(i!=0 && i!=std.length-1 && std[i+1]==2) { // i가 0이 아니고 다음 학생이 체육복이 2일 때
//					std[i] += 1;
//					std[i+1] -= 1;
//					lost_std -= 1;
//					System.out.println(Arrays.toString(std)+"c");
//					System.out.println(lost_std);
//				}
//				else if(i!=0 && i!=std.length-1 && std[i-1]==2) { // i가 0이 아니고 전 학생이 체육복이 2일 때
//					std[i] += 1;
//					std[i-1] -= 1;
//					lost_std -= 1;
//					System.out.println(Arrays.toString(std)+"d");
//				}
//				else {
//					lost_std -= 1;
//					System.out.println(Arrays.toString(std)+"e");
//					System.out.println(lost_std+" f");
//				}
//			}
//
		
		//System.out.println(Arrays.toString(std));
		//System.out.println(lost_std);
		System.out.println(n);
		System.out.println(lost_std);
		answer = n - lost_std;
		
		System.out.println(answer);		
	}
}
