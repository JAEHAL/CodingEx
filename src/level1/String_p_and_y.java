//���ڿ� �� p�� y�� ����

package level1;

public class String_p_and_y {
	public static void main(String[] args) {
		String s = "pPoooyY";
		
		boolean answer = true;
		
		String num = s.toLowerCase(); // s���� �ҹ��� ��ȯ
		int p = 0, y = 0;
		
		for(int i=0; i<num.length(); i++) {
			//if(num.charAt(i) == 'p') { // �� ����� �ִ� �� ����
			/*
			 * ���� ���� numó�� �ҹ��ڷ� ��ȯ���� ���� if������ num.charAt(i) == 'p' || num.charAt(i) == 'P' 
			 * �� ����� �ִ�
			*/
			if(num.substring(i, i+1).equals("p")) {
				p++;
			}
			else if(num.substring(i, i+1).equals("y")) {
				y++;
			}
		}
		//System.out.println("p: " + p + " y: " + y);
		
		if(p==y) {
			answer = true;
		}
		else if(p!=y) {
			answer = false;
		}
		
		System.out.println(answer);
		
	}
}
