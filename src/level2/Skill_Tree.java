// ��ųƮ�� ����

package level2;

public class Skill_Tree {
	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		int answer = 0;
		
		for(int i=0; i<skill_trees.length; i++) {
			String s1 = skill_trees[i];
			String tmp = "";
			for(int j=0; j<s1.length(); j++) {
				char ch = s1.charAt(j);
				
				if(skill.contains(""+ch)) {
					tmp += ch; // ���ڿ��� �� �ֱ� ���� �Է� ���
				}
			}
			//System.out.println(tmp);
			if(tmp.equals(skill.substring(0, tmp.length()))) {
				answer++;
			}
// ������ ��������� ��Ÿ�� ����
//			if(skill.contains(tmp) && tmp.charAt(0)=='C' && tmp.charAt(1)=='B') {
//				answer++;
//			}
		}
		
		System.out.println(answer);
	}
}
