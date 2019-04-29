// 124 나라의 숫자 문제

package level2;

public class Country124 {
	public static void main(String[] args) {
		int x;
		int n = 21;
		String answer = "";
		
		int rmd;
		
		while(n>0){
            rmd = n%3;
            n = n/3;

            if(rmd == 0){
                n -= 1;
                rmd = 4;
            }

            answer = rmd + answer;
        }

		
//		while(n>0) {
//			if(n/3==0) {
//				answer += n%3;
//				break;
//			}
//			else if(n%3==0) {
//				answer += (n%3)+4;
//				n = (n/3)-1;
//				if(n==0) {
//					break;
//				}
//			}
//		}
		
		System.out.println(answer);
	}
}
