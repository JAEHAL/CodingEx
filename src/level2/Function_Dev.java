// ��ɰ��� ����

package level2;

import java.util.LinkedList;
import java.util.Queue;

public class Function_Dev {
	public static void main(String[] args) {
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		int[] answer = {};
		
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=0; i<progresses.length; i++) {
			int tmp = 100 - progresses[i];
			int div = tmp/speeds[i];
			if(tmp%speeds[i]!=0) {
				div++;
			}
			q.offer(div);  
		}
		System.out.println(q.poll());
		
		System.out.println(answer);
	}
}
//ť�� �̿��ؼ� �۾����� ���Ѱ�(div)�� ���� �ְ� peek �޼ҵ带 �̿��ؼ� ���ϸ鼭 �� ����ϱ�