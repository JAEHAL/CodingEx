//���ڼ��ڼ�? ����

package level1;

public class Su_Bak_Su {
	public static void main(String[] args) {
		int n = 4;
		String answer = "";
		
		char[] s1 = new char[n];
		
		for(int i=0; i<n; i++) {
			if(i%2==0) {
				s1[i]='��';
			}
			else if(i%2 != 0) {
				s1[i]='��';
			}
		}
		
		answer = String.valueOf(s1);
		
		System.out.println(answer);
	}
}
