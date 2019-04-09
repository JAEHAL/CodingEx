//제일 작은 수 제거하기 문제

package codingEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Small_number_Remove {
	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		int[] answer = {};
		
		List<Integer> list = new ArrayList<>();
		
		int min = arr[0];
		
		if(arr.length==1) {
			list.add(-1);
		}
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != min) {
				list.add(arr[i]);
			}
		}
		System.out.println(list);
		
		// List배열을 int형 배열로 전환하는 방법
		answer = new int[list.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = list.get(i).intValue();
		}
		System.out.println(Arrays.toString(answer));
	}
}
