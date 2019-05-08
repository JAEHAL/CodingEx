// 다리를 지나는 트럭 문제

package level2;

import java.util.Arrays;

public class Truck_Passing_by {
	public static void main(String[] args) {
		int bridge_length = 2, weight = 10;
		int[] truck_weights = {7,4,5,6};
		int answer = 0;
		
		int[] num = new int[truck_weights.length];
		for(int i=0; i<truck_weights.length; i++) {
			num[i] = bridge_length;
		}
		System.out.println(Arrays.toString(num));

		System.out.println(answer);
	}
}
