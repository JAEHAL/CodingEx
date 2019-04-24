// 콜라츠 추측 문제

package level1;

public class Collatz {
	public static void main(String[] args) {
		int x; // 문제 완료 x
		int num = 16;
		int answer = 0;
		
		while(true) {
			if(num%2==0) {
				num = num/2;
				answer++;
			}
			else if(num%2!=0) {
				num = num*3+1;
				answer++;
			}
			else if(answer>500) {
				answer = -1;
				break;
			}
			else if(num==1) {
				break;
			}
		}
		
		System.out.println(answer);
	}
}
