//시저 암호 문제

package level1;

public class Ceser_Password {
	public static void main(String[] args) {
		String s = "a B z";
		int n = 4;
		String answer = "";
		
		char[] s1 = s.toCharArray();
		
		for(int i=0; i<s.length(); i++) {
			s1[i] = s.charAt(i);
		}
		System.out.println(s1);
		
		for(int i=0; i<s.length(); i++) {
			if(s1[i] >= 65 && s1[i] <91) { // 값이 대문자이면
				s1[i] = (char)(s1[i] + n);
				System.out.println(s1[i]);
				if(s1[i] >= 91) { // 대문자 범위를 벗어나면
					s1[i] = (char)((s1[i]-'A'+n)%26+'A');
					System.out.println(1);
				}
			}
			else if(s1[i] >= 97 && s1[i] <123) { // 값이 소문자이면
				s1[i] = (char)(s1[i] + n);
				if(s1[i] >= 123) { // 소문자 범위를 벗어나면
					s1[i] = (char)((s1[i]-'a'+n)%26+'a');
				}
			}
		}
		//System.out.println(s1);
		
		answer = new String(s1);
		
		System.out.println(answer);
	}
}
