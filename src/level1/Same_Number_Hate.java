//���� ���ڴ� �Ⱦ� ����

package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Same_Number_Hate {
	public static void main(String[] args) {
		int[] arr = {4,4,4,3,3};
		
		List<Integer> list = new ArrayList<>();
		int temp = -1; // arr���� ���� ���ϱ� ���� �� ����
		
		//arr�� ��
		for(int i=0; i<arr.length; i++) {
			if(temp == arr[i]) {}
			else {
				list.add(arr[i]);
				temp=arr[i];
			}
		}
		
		//���� ������� �� ������ ���
		/*
		 * for(int i : arr) { 
		 * 		if(temp == i) {} 
		 *		else { 
		 * 			list.add(i); temp=i; 
		 * 		} 
		 * }
		*/
		
		int[] answer = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		System.out.println(Arrays.toString(answer));
	}
}
