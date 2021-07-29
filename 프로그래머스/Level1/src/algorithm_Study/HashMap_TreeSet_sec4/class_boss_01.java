package algorithm_Study.HashMap_TreeSet_sec4;

import java.util.HashMap;
import java.util.Scanner;

/*
 ����
�б� ȸ���� �̴µ� �ĺ��� ��ȣ A, B, C, D, E �ĺ��� ����� �߽��ϴ�.
��ǥ�������� �� �л����� �ڱⰡ ������ �ĺ��� ��ȣ(���ĺ�)�� ������ ������ �������� �� ��ȣ�� ��ǥ�ϰ� �ֽ��ϴ�.
�������� ��ǥ�� ���� �� � ��ȣ�� �ĺ��� �б� ȸ���� �Ǿ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
�ݵ�� �� ���� �б�ȸ���� ����ǵ��� ��ǥ����� ���Դٰ� �����մϴ�.

�Է�
ù �ٿ��� �� �л��� N(5<=N<=50)�� �־����ϴ�.
�� ��° �ٿ� N���� ��ǥ������ ������ �ִ� �� �ĺ��� ��ȣ�� �������� ��ǥ�� ������� ���ڿ��� �Էµ˴ϴ�.


���
�б� ȸ������ ���õ� ��ȣ�� ����մϴ�.


���� �Է� 1 
15
BACBACCACCBDEDE

���� ��� 1
C
 */
public class class_boss_01 {
	static char solution(int n, String s)
	{
		char answer =0;
		HashMap<Character,Integer> map = new HashMap<>();
		for(char x : s.toCharArray())
		{
			//map ��ü�� x�� ������� ������ , x��� Ű�� ���� �������� Ű�� �������� ������ 0�� �����϶�.
			map.put(x,map.getOrDefault(x, 0)+1);
			//Ű�� ���� �������鼭  +1�� ���ָ鼭 ������!
		}
		
		//containsKey => �ֶ�� Ű �� �ֳ� ? True or False ����
		System.out.println(map.containsKey('A'));
		System.out.println(map.size()); //Key�� Size  ��ȯ
		// �����ϴ� map�� ��� key Ž��
		int max = Integer.MIN_VALUE;
		for (char key : map.keySet())
		{
			//get => get���ؼ� key�� value ���� ���Ͷ�
			//System.out.println(key+" "+map.get(key));
			if(map.get(key)>max)
			{
				max = map.get(key);
				answer = key; // �ʿ��Ѱ� �̸� (key) �̹Ƿ� 
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		class_boss_01 T = new class_boss_01();
		String s = "BACBACCACCBDEDE";
		int n = 15;
		System.out.println(solution(n,s));

	}

}
