//소수 찾기 문제

package level1;

public class Find_Decimal {
	public static void main(String[] args) {
		int x; // 문제 완료 x
		int n = 10;
		int answer = 0;
		
		//에라토스테네스의 체를 통해 소수 구하기
		
		
		//n값이 커질수록 효율성 떨어짐
		/*
		 * int num = 0;
		 * 
		 * for(int i=2; i<=n; i++) { for(int j=2; j<=i; j++) { if(i%j == 0) { num++; } }
		 * if(num==1) { answer++; } num=0; }
		 */
		
		System.out.println(answer);
	}
}
