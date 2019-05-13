package startUp;

import java.util.ArrayList;
import java.util.List;

public class Taxi {
	public static void main(String[] args) {
		int[] s = {2,3,4,4,2,1,3,1};
		int answer = 0;
		
		answer = s.length;
		
		List<Integer> list = new ArrayList<>();

		for(int i=0; i<s.length; i++) {
			list.add(s[i]);
		}
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			for(int j=i+1; j<list.size(); j++) {
				if(list.get(i)+list.get(j)<=4) {
					answer--;
					System.out.println("i= " + i + " j= " + j);
					list.remove(i);
					list.remove(j-1);
					System.out.println(list);
					i=0; j=0;
				}
//				else if(list.get(i)==4) {
//					answer++;
//					System.out.println("i= " + i);
//					list.remove(i);
//					System.out.println("''''''" + list);
//					i=0;
//					j=0;
//				}
			}
		}
		
		System.out.println(answer);
	}
}
