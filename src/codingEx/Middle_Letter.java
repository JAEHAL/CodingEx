//��� ���� �������� ����

package codingEx;

public class Middle_Letter {
	public static void main(String[] args) {
		String s = "abcde";
		String answer = "";
		
		int s1 = s.length()/2; // s������ �� �ε���
		
		if(s.length()%2 == 0) { // s���ڿ��� ¦�� �� ��
			String sub1 = s.substring(s1-1, s1+1);
			answer = sub1;
		}
		else if(s.length()%2 != 0) { // s���ڿ��� Ȧ�� �� ��
			String sub2 = s.substring(s1, s1+1);
			answer = sub2;
		}
	
		System.out.println(answer);
	}
}
