// 이상한 문자 만들기 문제

package level1;

import java.util.Arrays;

public class Strange_Text {
	public static void main(String[] args) {
		int x; // 문제 완료 x
		String s = "try hello world";
		String answer = "";
		
		String[] list = s.split(" ");
		System.out.println(Arrays.toString(list));
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<list.length; i++) {
			for(int j=0; j<list[i].length(); j++) {
				if(j%2==0) {
					sb.append(String.valueOf(list[i].charAt(j)).toUpperCase());
				}
				else {
					sb.append(String.valueOf(list[i].charAt(j)).toLowerCase());
				}
			}
			if(i<list.length-1) {
				sb.append(" ");
			}
		}
		answer = sb.toString();
		
		System.out.println(answer);
	}
}
