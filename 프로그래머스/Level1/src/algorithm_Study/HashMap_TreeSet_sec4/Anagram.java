package algorithm_Study.HashMap_TreeSet_sec4;

import java.util.HashMap;

/*
 ����

Anagram�̶� �� ���ڿ��� ���ĺ��� ���� ������ �ٸ����� �� ������ ��ġ�ϸ� �� �ܾ�� �Ƴ��׷��̶�� �մϴ�.

���� ��� AbaAeCe �� baeeACA �� ���ĺ��� ���� ������ �ٸ����� �� ������ ���캸�� A(2), a(1), b(1), C(1), e(2)��

���ĺ��� �� ������ ��� ��ġ�մϴ�. �� ��� �� �ܾ �� �迭�ϸ� ����� �ܾ �� �� �ִ� ���� �Ƴ��׷��̶� �մϴ�.

���̰� ���� �� ���� �ܾ �־����� �� �ܾ �Ƴ��׷����� �Ǻ��ϴ� ���α׷��� �ۼ��ϼ���. �Ƴ��׷� �Ǻ��� ��ҹ��ڰ� ���е˴ϴ�.


�Է�
ù �ٿ� ù ��° �ܾ �Էµǰ�, �� ��° �ٿ� �� ��° �ܾ �Էµ˴ϴ�.

�ܾ��� ���̴� 100�� ���� �ʽ��ϴ�.


���
�� �ܾ �Ƴ��׷��̸� ��YES"�� ����ϰ�, �ƴϸ� ��NO"�� ����մϴ�.

���� �Է� 1 
AbaAeCe
baeeACA

���� ��� 1
YES

���� �Է� 2 
abaCC
Caaab

���� ��� 2
NO

 */
public class Anagram {
	static String Solution(String s1, String s2)
	{
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		 
		for(char x : s1.toCharArray())
		{
			map.put(x, map.getOrDefault(x,0)+1);
		}
		
		for(char x : s2.toCharArray())
		{
			if(!map.containsKey(x) || map.get(x)==0) 
			{
				return "NO";
			}
			map.put(x, map.get(x)-1);
			
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "AbaAeCe";
		String b  = "AbaAeCe";
		System.out.println(Solution(a,b));

	}

}
