package level1;

import java.util.HashMap;

/*
 
 * ������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.

�����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��,
 �������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
�������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
������ �߿��� ���������� ���� �� �ֽ��ϴ�.
����� ��

participant	completion								return
["leo", "kiki", "eden"]								["eden", "kiki"]	"leo"
["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
["mislav", "stanko", "mislav", "ana"]				["stanko", "ana", "mislav"]				"mislav"

����� �� ����
���� #1
"leo"�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.

���� #2
"vinko"�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.

���� #3
"mislav"�� ������ ��ܿ��� �� ���� ������, ������ ��ܿ��� �� ��ۿ� ���� ������ �Ѹ��� �������� ���߽��ϴ�.
 */

public class no_maraton_wanjoo {

	

	   static String solution(String[] participant, String[] completion) {
	      String answer = "";
	      HashMap<String, Integer> hm = new HashMap<>();
	      for(String player : participant)
	      {
	          hm.put(player, hm.getOrDefault(player,0)+1);
	      }
	      for(String player : completion)
	      {
	          hm.put(player, hm.get(player)-1);
	      }
	           
	      for(String key : hm.keySet())
	      {
	          if(hm.get(key)!=0)
	          {
	            answer= key;
	            break;
	          }
	      }
	    return answer;
	    }
	    
	public static void main(String[] args) {
		String []parti = {"leo","kiki","eden"};
		String []compl = {"eden", "kiki"};
		System.out.println(solution(parti,compl));

	}

}
