//문자열 내 p와 y의 개수

package level1;

public class String_p_and_y {
	public static void main(String[] args) {
		String s = "pPoooyY";
		
		boolean answer = true;
		
		String num = s.toLowerCase(); // s문자 소문자 변환
		int p = 0, y = 0;
		
		for(int i=0; i<num.length(); i++) {
			//if(num.charAt(i) == 'p') { // 이 방법도 있다 더 간단
			/*
			 * 굳이 위에 num처럼 소문자로 변환하지 말고 if문에서 num.charAt(i) == 'p' || num.charAt(i) == 'P' 
			 * 이 방법도 있다
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
