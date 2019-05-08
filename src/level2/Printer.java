// 프린터 문제 

package level2;

import java.util.ArrayList;
import java.util.List;

public class Printer {
	public static void main(String[] args) {
		int[] priorities = {2,1,3,2};
		int location = 2, answer = 0;
		
		List<Integer> list = new ArrayList<>();
		
		int max = priorities[0];
		
		for(int i=0; i<priorities.length; i++) {
			if(max<priorities[i]) {
				max = priorities[i];
			}
		}
		//System.out.println(max);
		
		
		
		System.out.println(answer);
	}
}
