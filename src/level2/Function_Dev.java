// 기능개발 문제

package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Function_Dev {
	public static void main(String[] args) {
		int[] progresses = {93,30,55,60,40,65};
		int[] speeds = {1,30,5,10,60,7};
		int[] answer = {};
		
		Queue<Integer> q = new LinkedList<>(); // 작업일 계산값을 넣기 위한 큐 배열
		ArrayList<Integer> list = new ArrayList<>(); // 작업일 간 비교를 한 후 값을 넣기 위한 배열
		
		for(int i=0; i<progresses.length; i++) {
			int tmp = 100 - progresses[i];
			int div = tmp/speeds[i];
			if(tmp%speeds[i]!=0) {
				div++;
			}
			q.offer(div); // OR q.add(div);도 가능
		}
		
		int num = 0; // 작업량 간 비교를 위한 0으로 초기화
		int target; // 비교하기 위한 첫 값을 넣기 위한 변수
		
		while(!q.isEmpty()) { // 큐가 계속해서 비어있지 않는지 확인을 해주면서 출력을 해야 큐안에 모든 내용을 출력할 수 있다.
			target = q.poll();
			num++;
			
			while(!q.isEmpty()) {
				if(target>q.peek()) {
					q.poll();
					num++;
				}
				else {
					list.add(num);
					num=0;
					break;
				}
			}
		}
		list.add(num);
		
		answer = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		System.out.println(Arrays.toString(answer));
	}
}
//큐를 이용해서 작업일을 구한것(div)을 집어 넣고 peek 메소드를 이용해서 비교하면서 값 출력하기