// 하샤드 수 문제

package codingEx;

public class Harshad {
	public static void main(String[] args) {
		int x = 13;
		boolean answer = true;
		
		String x1 = Integer.toString(x);
		int num = 0;
		
		for(int i=0; i<x1.length(); i++) {
			num += x1.charAt(i) - '0'; // char형을 int형으로 변환하는 방법
			//System.out.println(x1.charAt(i));
		}
		System.out.println(num);
		
		if(x%num==0) {
			
		}
		else {
			answer = false;
		}
		
		System.out.println(answer);
	}
}
