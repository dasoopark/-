package algorithm_Study.Greedy_Algorithm_sec9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 ����

������ ���� �޿� ��ȥ�� �մϴ�.
������ ��ȥ�� �Ƿο��� ��Ҹ� ���� 3�ϰ� ���� �ʰ� �Ϸ��� �մϴ�.
�Ƿο��� �����ϴ� ģ���� N���� �����ϴ� �ð������� ������ ģ���鿡�� �̸� �䱸�߽��ϴ�.

�� ģ������ �ڽ��� �� �ÿ� �����ؼ� �� �ÿ� ���� ������ �������� �˷��־����ϴ�.
������ �� ������ �������� �Ƿο� ��ҿ� ���ÿ� �����ϴ� �ִ� �ο����� ���Ͽ� �� �ο��� ������ �� �ִ� ��Ҹ� �������� �մϴ�. �������� ������ �����ּ���.
���� �� ģ���� ���� �ð� 13, ���½ð� 15��� �� ģ���� 13�� ������ �Ƿο� �忡 �����ϴ� ���̰� 15�� �������� �������� �ʴ´ٰ� �����մϴ�.


�Է�
ù° �ٿ� �Ƿο��� ������ �ο��� N(5<=N<=100,000)�� �־����ϴ�.
�� ��° �ٺ��� N�ٿ� ���� �� �ο��� ���� �ð��� ���� �ð��� �־����ϴ�.
�ð��� ù�� 0�ø� 0���� �ؼ� �������� �� 12�ø� 72�� �ϴ� Ÿ�Ӷ������� ���� �ð��� ���� �ð��� ���� �ƴ� ������ ǥ���˴ϴ�.

���
ù° �ٿ� �Ƿο��忡 ���ÿ� �����ϴ� �ִ� �ο��� ����ϼ���.

���� �Է� 1 
5
14 18
12 15
15 20
20 30
5 14

���� ��� 1
2
 */
class Time implements Comparable<Time>
{
	public int time;
	public char state;
	Time(int time, char state)
	{
		this.time = time;
		this.state = state;
	}
	@Override
	public int compareTo(Time ob)
	{
		if(this.time == ob.time)
		{
			return this.state-ob.state; //�ð��� ������ �� ���ĺ����� �����϶�.
		}
		else
		{
			return this.time-ob.time; //�ƴ϶�� ȸ�� ������ �ð��� �������� ����  ������ �߿��ϴϱ� �ܿ��μ���
		}
	}
}


public class wedding_sec03 {
	
	static int solution(ArrayList<Time> arr)
	{
		int answer =Integer.MIN_VALUE;
		Collections.sort(arr); //���ĺ� e�� ���� ���� - ���� ����
		int cnt = 0;
		
		for(Time ob : arr)
		{
			if(ob.state=='s')
			{
				cnt++;
			}
			else
			{
				cnt--;
				answer = Math.max(answer, cnt); //cnt�� answer���� ũ�� ���Ž�Ű��
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

				Scanner kb = new Scanner(System.in);
				int n = kb.nextInt();
				ArrayList<Time> arr = new ArrayList<>();
				for(int i =0; i<n; i++)
				{
					int sT = kb.nextInt();
					int eT = kb.nextInt();
					arr.add(new Time(sT, 's'));
					arr.add(new Time(eT, 'e'));
				}
				System.out.println(solution(arr));

	}

}
