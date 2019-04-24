//모의고사 문제

package level1;

import java.util.Arrays;

public class MockExam {
	
	public static void main(String[] args) {
		
		int[] answer = {};
		int[] answers = {1,2,3,4,5};
		
		int[][] std = {
				{1,2,3,4,5}, // 1번 학생 답 찍는 순서
				{2,1,2,3,2,4,2,5}, // 2번 학생 답 찍는 순서
				{3,3,1,1,2,2,4,4,5,5} // 3번 학생 답 찍는 순서
		};
		
		int[] check = new int[3]; // 맞은 갯수 넣는 배열
		
		//맞는 답 각 학생 마다 구함 //else if문 쓰면 하나의 if문이 참이면 나머지가 구해지지 않아서 모두 if문을 사용
		//i%5, i%8, i%10등 나머지연산을 이용해서 정답배열의 길이 크기 만큼 반복해서 맞으면 맞은 갯수 넣는 배열인 check배열에 1씩 더해서 넣어준다
		for(int i=0; i<answers.length; i++) {
			if(std[0][i%5] == answers[i]) {
				check[0] += 1;
				//System.out.println(Arrays.toString(check));
			}
			if(std[1][i%8] == answers[i]) {
				check[1] += 1;
				//System.out.println(Arrays.toString(check));
			}
			if(std[2][i%10] == answers[i]) {
				check[2] += 1;
				//System.out.println(Arrays.toString(check));
			}
		}
		
		//System.out.println(Arrays.toString(check));
		
		int max = check[0]; // max가 check[0]이라고 가정
		//System.out.println(check[0]);
		
		if(max<check[1] && check[1]>check[2]) { //check[1]이 제일 크면
			answer = new int[1];
			answer[0] = 2;
		}
		else if(max<check[2] && check[2]>check[1]) { //check[2]이 제일 크면
			answer = new int[1];
			answer[0] = 3;
		}
		else if(max>check[1] && max>check[2]) { //check[0]이 제일 크면
			answer = new int[1];
			answer[0]=1;
		}
		else if(max==check[1] && check[1]>check[2]) { //check[0]과 check[1]이 제일 크면
			answer = new int[2];
			answer[0]=1;
			answer[1]=2;
		} 
		else if(max<check[1] && check[1]==check[2]) { //check[1]과 check[2]가 제일 크면
			answer = new int[2];
			answer[0]=2;
			answer[1]=3;
		}
		else if(max==check[2] && max>check[1]) { //check[0]과 check[2]가 제일 크면
			answer = new int[2];
			answer[0]=1;
			answer[1]=3;
		}
		else { // 세 개가 모두 같으면
			answer = new int[3];
			answer[0]=1;
			answer[1]=2;
			answer[2]=3;
		}
		
		System.out.println(Arrays.toString(answer));
		
	}	
}
