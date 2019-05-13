// 124 나라의 숫자 문제

package level2;

public class Country124 {
	public static void main(String[] args) {
		int n = 6;
		String answer = "";
		
		while(n>0){
            int na = n%3;
            n = n/3;

            if(na == 0){
                n -= 1;
                na = 4;
            }

            answer = na + answer;
		}
		
		System.out.println(answer);
	}
}
