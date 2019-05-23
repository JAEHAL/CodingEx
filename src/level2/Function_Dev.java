// ��ɰ��� ����

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
//ť�� �̿��ؼ� �۾����� ���Ѱ�(div)�� ���� �ְ� peek �޼ҵ带 �̿��ؼ� ���ϸ鼭 �� ����ϱ�