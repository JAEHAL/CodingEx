//���� ���ڴ� �Ⱦ� ����

package codingEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Same_Number_Hate {
	public static void main(String[] args) {
		int[] arr = {4,4,4,3,3};
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] != arr[i+1] && arr[i] != arr[i-1]) { // �� ���� �ߺ��� �ϳ��� ���� �� ���ϱ�
				System.out.println(arr[i]+"a");
				list.add(arr[i]);
			}
			
			else if(arr[i] == arr[i+1]) { // �� ���� ���� ��
				if(i==0 || i==arr.length-2) { // ù ��° ���� ������ ���� ���� �Ŵ� ���� ����
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
