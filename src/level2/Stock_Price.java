// 주식가격 문제

package level2;

import java.util.Arrays;

public class Stock_Price {
	public static void main(String[] args) {
		int[] prices = {1,2,3,2,3};
		int[] answer = new int[prices.length];
		
		answer[prices.length-1] = 0;
		int num = 0;
		
		for(int i=0; i<prices.length-1; i++) {
			for(int j=i+1; j<prices.length; j++) {
				if(prices[i]<=prices[j]) {
					num++;
				}
				else {
					num++;
					break;
				}
			}
			answer[i] = num;
			num=0;
		}
		
		System.out.println(Arrays.toString(answer));
	}
}
 