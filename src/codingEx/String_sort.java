//���ڿ� �� ������� �����ϱ� ����

package codingEx;

import java.util.Arrays;

public class String_sort {
	public static void main(String[] args) {
		String[] strings = {"abce","abcd","cda"};
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
//				System.out.println(num[i] + " " + strings[j].substring(n));
				if(num[i] == strings[j].substring(n)) {
					answer[i] = strings[j];
				}
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}
}