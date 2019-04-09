// 정수 제곱근 판별 영어로

package codingEx;

public class Int_Square_root {
	public static void main(String[] args) {
		long n = 9;
		long answer = 0;
		
		//System.out.println(Math.sqrt(n)*Math.sqrt(n));
		//System.out.println(Math.pow(Math.sqrt(n), 2));
		
		long sqrt = (long)Math.sqrt(n);
		
		if(n==Math.pow(sqrt,2)) {
			answer = (long)Math.pow((sqrt+1), 2);
		}
		else {
			answer = -1;
		}
		
		System.out.println(answer);
	}
}
