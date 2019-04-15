// 평균 구하기 문제

package codingEx;

public class Average {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		double answer = 0;
		
		double t_plus = 0;
		for(int num : arr) {
			t_plus += num;
		}
		System.out.println(t_plus);
		
		answer = t_plus/(double)arr.length;
		
		System.out.println(answer);
	}
}
