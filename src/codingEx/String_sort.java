//���ڿ� �� ������� �����ϱ� ����

package codingEx;

import java.util.Arrays;

public class String_sort {
	public static void main(String[] args) {
		int x; // ���� �Ϸ� x
		String[] strings = {"abcca","adcca","cda"};
		//String[] strings = {"abce","abcd","cdx"};
		int n = 2;
		
		String[] answer = new String[strings.length];
		
		String[] num = new String[strings.length]; // �ε��� n��° ���� �� �ֱ� ���� �迭
		
		// �ε��� n��° ����
		for(int i=0; i<strings.length; i++) {
			num[i] = strings[i].substring(n);
		}
		System.out.println(Arrays.toString(num));
		
		Arrays.sort(num);
		
		System.out.println(Arrays.toString(num));
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<strings.length; j++) {
				if(num[i] == num[j]) {
					
				}
				if(num[i].equals(strings[j].substring(n))) {
					answer[i] = strings[j];
				}
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}
}
