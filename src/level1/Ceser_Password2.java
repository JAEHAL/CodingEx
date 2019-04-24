// 시저 암호 문제 남이 푼거

package level1;

public class Ceser_Password2 {
	public static void main(String[] args) {
		String s = "a B z";
		int n = 4;
		String answer = "";
		
		//n = n%26;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isLowerCase(ch)) { // ch가 소문자이면
				ch = (char)((ch-'a'+n)%26+'a');
			}
			else if(Character.isUpperCase(ch) ) { // ch가 대문자이면
				ch = (char)((ch-'A'+n)%26+'A');
			}
			answer += ch;
		}
			
		System.out.println(answer);
	}
}
