//���ڿ� ������������ ��ġ�ϱ� ����

package codingEx;

import java.util.Arrays;

public class Descending_String {
	public static void main(String[] args) {
		//String s = "AcdeaC";
		String s = "Zbcdefg";
		String answer = "";
		
		char[] s1 = s.toCharArray(); // ���ڿ��� char�� ��ȯ�ϴ� ���
		char[] s2 = new char[s.length()]; // s1�� ���� �迭������ �Ųٷ� ��� ���� �迭 ����
		
		System.out.println(Arrays.toString(s1));
		Arrays.sort(s1);
		System.out.println(Arrays.toString(s1) + " 1");
		
		for(int i=s1.length-1; i>=0; i--) {
			//System.out.println(i);
			s2[(s1.length-1)-i] = s1[i];
		}
		
		System.out.println(Arrays.toString(s2) + " 2");
		answer = String.valueOf(s2); // char �迭�� ���ڿ��� ��ȯ�ϴ� ���
		// char �迭�� ���ڿ��� ��ȯ�ϴ� �ٸ� ���
		/*
		 * answer = new String(s2);
		*/
		
		System.out.println(answer);
	}
}
