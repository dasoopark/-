package algorithm_Study.Greedy_Algorithm_sec9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
 4. �ִ� ���� ������(PriorityQueue ���빮��)
����
������ ������ �������̴�. N���� ������� ���� ��û�� �ؿԴ�. �� ����� D�� �ȿ� �ͼ� ������ �� �ָ� M��ŭ�� �����Ḧ �ֱ�� �ߴ�.
�� ����� ��û�� D�� M�� �������� ���� ���� ���� �� �� �ֵ��� ���� �������� ¥�� �Ѵ�.
�� ������ Ư���� ������ �Ϸ翡 �ϳ��� ��������� ������ �� �� �ִ�.

�Է�
ù ��° �ٿ� �ڿ��� N(1<=N<=10,000)�� �־�����, ���� N���� �ٿ� M(1<=M<=10,000)�� D(1<=D<=10,000)�� ���ʷ� �־�����.


���
ù ��° �ٿ� �ִ�� �� �� �ִ� ������ ����Ѵ�.


���� �Է� 1 

6
50 2
20 1
40 2
60 3
30 3
30 1
���� ��� 1

150
 */

class Lecture implements Comparable<Lecture>
{
	public int money;
	public int time;
	Lecture(int money, int time)
	{
		this.money = money;
		this.time = time;
	}
	
	@Override
	public int compareTo(Lecture ob)
	{
		return ob.time - this.time; //ArrayList �������� ����
	}
}
public class priority_money_04 {
	static int n, max =Integer.MIN_VALUE;
	static int solution(ArrayList<Lecture> arr)
	{
		int answer = 0;
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		//Collections.reverseOrder�� �ؾ� ū ���� �켱������ �����ְ� ��!!!!!!!!!!!!!!!!!
		//�⺻�� ���� ���� �켱������ ������ (Collections.reverseOrder ���� ��)
		
		Collections.sort(arr);
		
		int j = 0;
		for(int i = max; i>=1 ;i--) //i�� ���� ū ������ 1�ϱ��� �پ��
		{
			for( ; j<n ; j++)
			{
				if(arr.get(j).time< i) // ���� ū ������ ���� �� ¥ �϶� �극��ũ ���ּ���(OneNote����)
					break; 			// Ex) => 3�Ͽ��� 2�� �ٲ� �� ���ϴ°��� 
				 pQ.offer(arr.get(j).money); // time���� money �־��� 
			}
		
			if(!pQ.isEmpty())
			{
				answer += pQ.poll(); //���� ū �� ������ �ְԵ�.- reversOrder����
			}
			
		}
		return answer;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		ArrayList<Lecture> arr = new ArrayList<>();
		for(int i =0; i<n; i++)
		{
			int m = kb.nextInt();
			int d = kb.nextInt();
			arr.add(new Lecture(m, d));
			if(d>max)
			{
				max =d; //���� ū ��¥ ���� ���� ���ؼ� (3�� 2�� 1��) => max = 3�� (Onenote����)
			}
		}
		System.out.println(solution(arr));

	}

}
