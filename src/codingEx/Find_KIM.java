//���￡�� �輭�� ã�� ����

package codingEx;

public class Find_KIM {
	public static void main(String[] args) {
		String[] seoul = {"Jane", "qwe" ,"Kim"};
		int answer = -1;
		
		for(int i=0; i<seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				answer = i;
			}
		}
		
		
		System.out.println("�輭���� " + answer + "�� �ִ�");
	}
}
