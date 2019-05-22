// ��ɰ��� ����

package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Function_Dev {
	public static void main(String[] args) {
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		int[] answer = {};
		
		Queue<Integer> q = new LinkedList<>(); // �۾��� ��갪�� �ֱ� ���� ť �迭
		ArrayList<Integer> list = new ArrayList<>(); // �۾��� �� �񱳸� �� �� ���� �ֱ� ���� �迭
		
		for(int i=0; i<progresses.length; i++) {
			int tmp = 100 - progresses[i];
			int div = tmp/speeds[i];
			if(tmp%speeds[i]!=0) {
				div++;
			}
			q.offer(div); // OR q.add(div);�� ����
		}
		
		int num = 0; // �۾��� �� �񱳸� ���� 0���� �ʱ�ȭ
		int target; // ���ϱ� ���� ù ���� �ֱ� ���� ����
		while(!q.isEmpty()) { // ť�� ����ؼ� ������� �ʴ��� Ȯ���� ���ָ鼭 ����� �ؾ� ť�ȿ� ��� ������ ����� �� �ִ�.
			target = q.poll();
			System.out.println(target);
			
			System.out.println(q.poll());
		}
		
		System.out.println(Arrays.toString(answer));
	}
}
//ť�� �̿��ؼ� �۾����� ���Ѱ�(div)�� ���� �ְ� peek �޼ҵ带 �̿��ؼ� ���ϸ鼭 �� ����ϱ�