// 핸드폰 번호 가리기

package level1;

public class Phone_Number {
	public static void main(String[] args) {
		String phone_number = "027778888";
		String answer = "";
		
		char[] ch = phone_number.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			if(i<ch.length-4) {
				ch[i] = '*';
			}
		}
		answer = String.valueOf(ch);
		
		System.out.println(answer);
	}
}
