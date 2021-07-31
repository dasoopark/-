package algorithm_Study.HashMap_TreeSet_sec4;

import java.util.ArrayList;
import java.util.HashMap;

/*
 
 ����

������ �ƺ��� �������� ��մϴ�. �����ƺ��� �������� N�� ������ �������� �ְ� ���ӵ� K�� ������ ������� ������
�� �������� ���϶�� �߽��ϴ�.

���� N=7�̰� 7�� ���� �������� �Ʒ��� ����, �̶� K=4�̸�
20 12 20 10 23 17 10
�� ���� 4�ϰ��� ������ ����������

ù ��° ������ [20, 12, 20	, 10]�� ������� ������ 20, 12, 10���� 3�̴�.

�� ��° ������ [12, 20, 10, 23]�� ������� ������ 4�̴�.

�� ��° ������ [20, 10, 23, 17]�� ������� ������ 4�̴�.

�� ��° ������ [10, 23, 17, 10]�� ������� ������ 3�̴�.

N�ϰ��� �����ϰ� ���ӱ����� ���� K�� �־����� ù ��° �������� �� ������

������� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù �ٿ� N(5<=N<=100,000)�� K(2<=K<=N)�� �־����ϴ�.
�� ��° �ٿ� N���� ���ڿ��� �־����ϴ�. �� ���ڴ� 500������ ���� �ƴ� �����Դϴ�.

���
ù �ٿ� �� ������ ����� ������ ������� ����մϴ�.

���� �Է� 1 

7 4
20 12 20 10 23 17 10

���� ��� 1
3 4 4 3
 */
public class sales_cost_03 { //Hash , Sliding Window ���
	
	static ArrayList<Integer> solution(int n, int k, int[] arr)
	{
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> HM = new HashMap<>();
		
		//�ε����ϱ� -1 ������ �������
		for(int i=0; i<k-1;i++)
		{
			HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
		}
		int lt =0;
		
		//0�� �ε��� ���� �����ϴϱ� k-1 ����
		for(int rt=k-1;rt<n;rt++ ) //rt�� ���� lt�� �Ѿư��°� => slide window
		{
			HM.put(arr[rt],HM.getOrDefault(arr[rt], 0)+1);
			answer.add(HM.size());
			HM.put(arr[lt], HM.get(arr[lt])-1);
			if(HM.get(arr[lt])==0)
			{
				HM.remove(arr[lt]);
			}
			lt++;
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int k = 4;
		int[] arr = {20, 12, 20, 10, 23, 17, 10};
		System.out.println(solution(n,k,arr));

	}

}
