// ž ����

package level2;

import java.util.Arrays;

public class Top {
	public static void main(String[] args) {
		int[] heights = {3,9,9,3,5,7,2};
		int[] answer = new int[heights.length];
		
		for(int i=heights.length-1; i>=0; i--) {
			int tmp = heights[i];
			//System.out.println("i= " + i);
			//System.out.println(tmp);
			for(int j=i-1; j>=0; j--) {
				//System.out.println(tmp);
				if(tmp < heights[j]) {
					answer[i] = j+1;
					break;
				}
				else {
					answer[i] = 0;
				}
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}
}
