//같은 숫자는 싫어 문제

package codingEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Same_Number_Hate {
	public static void main(String[] args) {
		int[] arr = {4,4,4,3,3};
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] != arr[i+1] && arr[i] != arr[i-1]) { // 양 옆에 중복이 하나도 없는 값 구하기
				System.out.println(arr[i]+"a");
				list.add(arr[i]);
			}
			
			else if(arr[i] == arr[i+1]) { // 양 옆이 같을 때
				if(i==0 || i==arr.length-2) { // 첫 번째 값과 마지막 값이 같은 거는 조건 따로
					System.out.println(arr[i]+"b");
					list.add(arr[i]);
				}
				else {
					System.out.println(arr[i]+"c");
					list.add(arr[i]);
				}
			}
		}
		
		int[] answer = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		System.out.println(Arrays.toString(answer));
	}
}
