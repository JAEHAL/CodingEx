//나누어 떨어지는 숫자 배열

package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Div_Zero {
	public static void main(String[] args) {
		int[] arr = {3,2,6};
		int divisor = 10;
		
		ArrayList<Integer> list = new ArrayList<>();
		int num = 0;
		
		for(int i : arr) {
			if((i%divisor)==0) {
				list.add(i);
			}
			else if((i%divisor)!=0) {
				num++;
				if(num == arr.length) {
					list.add(-1);
				}
			}
		}
		System.out.println(list);
		
		int[] answer = new int[list.size()];
		
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}

		Arrays.sort(answer);
		System.out.println(Arrays.toString(answer));
	}
}
