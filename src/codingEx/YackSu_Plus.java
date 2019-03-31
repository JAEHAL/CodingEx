//약수의합 문제

package codingEx;

public class YackSu_Plus {
	public static void main(String[] args) {
		int n = 12;
		int answer = 0;
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				answer += i;
			}
		}
		
		System.out.println(answer);
	}
}
