//두 정수 사이의 합 문제

package codingEx;

public class Number_Plus {
	public static void main(String[] args) {
		int a = 1;
		int b = 10;
		
		long answer = 0;
		
		if(a==b) {
			answer = a;
		}
		else if(a!=b) {
			if(a<b) {
				for(int i=a; i<=b; i++) {
					answer += i;
				}
			}
			else if(a>b) {
				for(int i=b; i<=a; i++) {
					answer += i;
				}
			}
		}
		
		System.out.println(answer);
	}
}
