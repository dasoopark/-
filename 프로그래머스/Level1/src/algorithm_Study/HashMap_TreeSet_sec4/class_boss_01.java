package algorithm_Study.HashMap_TreeSet_sec4;

import java.util.HashMap;
import java.util.Scanner;

/*
 설명
학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.
투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.
반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.

입력
첫 줄에는 반 학생수 N(5<=N<=50)이 주어집니다.
두 번째 줄에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로 문자열로 입력됩니다.


출력
학급 회장으로 선택된 기호를 출력합니다.


예시 입력 1 
15
BACBACCACCBDEDE

예시 출력 1
C
 */
public class class_boss_01 {
	static char solution(int n, String s)
	{
		char answer =0;
		HashMap<Character,Integer> map = new HashMap<>();
		for(char x : s.toCharArray())
		{
			//map 객체에 x가 만들어져 있으면 , x라는 키의 값을 가져오고 키가 존재하지 않으면 0을 리턴하라.
			map.put(x,map.getOrDefault(x, 0)+1);
			//키의 값을 가져오면서  +1씩 해주면서 갱신함!
		}
		
		//containsKey => 애라는 키 가 있냐 ? True or False 리턴
		System.out.println(map.containsKey('A'));
		System.out.println(map.size()); //Key의 Size  반환
		// 존재하는 map의 모든 key 탐색
		int max = Integer.MIN_VALUE;
		for (char key : map.keySet())
		{
			//get => get을해서 key의 value 값을 얻어와라
			//System.out.println(key+" "+map.get(key));
			if(map.get(key)>max)
			{
				max = map.get(key);
				answer = key; // 필요한건 이름 (key) 이므로 
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
