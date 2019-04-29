// 기능개발 문제

package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Function_Dev {
	public static void main(String[] args) {
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		List<Integer> answer = new ArrayList<>();
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<progresses.length; i++) {
			int tmp = 100 - progresses[i];
			int div = tmp/speeds[i];
			if(tmp%speeds[i]!=0) {
				div++;
			}
			list.add(div);  
		}
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
			for(int j=i+1; j<list.size(); j++) {
				
			}
		}
		
		System.out.println(answer);
	}
}
 