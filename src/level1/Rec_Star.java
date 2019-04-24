// 직사각형 별찍기 문제

package level1;

import java.util.Scanner;

public class Rec_Star {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=1; i<=b; i++) {
			for(int j=1; j<=a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//System.out.println(a+b);
	}
}
