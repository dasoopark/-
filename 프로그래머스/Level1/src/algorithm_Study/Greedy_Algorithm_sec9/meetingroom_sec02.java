package algorithm_Study.Greedy_Algorithm_sec9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 ����
�� ���� ȸ�ǽ��� �ִµ� �̸� ����ϰ��� �ϴ� n���� ȸ�ǵ鿡 ���Ͽ� ȸ�ǽ� ���ǥ�� ������� �Ѵ�.
�� ȸ�ǿ� ���� ���۽ð��� ������ �ð��� �־��� �ְ�, �� ȸ�ǰ� ��ġ�� �ʰ� �ϸ鼭 ȸ�ǽ��� ����� �� �ִ� �ִ���� ȸ�Ǹ� ã�ƶ�.
��, ȸ�Ǵ� �ѹ� �����ϸ� �߰��� �ߴܵ� �� ������ �� ȸ�ǰ� ������ �Ͱ� ���ÿ� ���� ȸ�ǰ� ���۵� �� �ִ�.


�Է�
ù° �ٿ� ȸ���� �� n(1<=n<=100,000)�� �־�����. ��° �ٺ��� n+1 �ٱ��� �� ȸ���� ������ �־����µ�
�̰��� ������ ���̿� �ΰ� ȸ���� ���۽ð��� ������ �ð��� �־�����. ȸ�ǽð��� 0�ú��� �����Ѵ�.
ȸ���� ���۽ð��� ������ �ð��� ������ (���۽ð� <= ������ �ð�)�Դϴ�.

���
ù° �ٿ� �ִ� ����� �� �ִ� ȸ�� ���� ����Ͽ���.

���� �Է� 1 
5
1 4
2 3
3 5
4 6
5 7

���� ��� 1
3

���� �Է� 2 
3
3 3
1 3
2 3

���� ��� 2
2

 */

class Time implements Comparable<Time>
{
	public int s, e;
	Time(int s, int e)
	{
		this.s = s;
		this.e = e;
	}
	@Override
	public int compareTo(Time o)
	{
		if(this.e == o.e)
		{
			return this.s-o.s; //��� ȸ�� �ð��� ���ٸ� ���� �ð��� �������� ���� - OneNote����
		}
		else
		{
			return this.e-o.e; //�ƴ϶�� ȸ�� ������ �ð��� �������� ����  ������ �߿��ϴϱ� �ܿ��μ���
		}
	}
}

public class meetingroom_sec02 {
	

	static int solution(ArrayList<Time> arr, int n)
	{
		int cnt = 0;
		Collections.sort(arr);
		int et = 0; //ȸ�� ������ �ð�
		
		for(Time ob : arr) //������ �� ��Ȳ���� ����
		{
			if(ob.s>=et) //���ο� ȸ�� �� �� ���� �� 
			{
				cnt++;
				et = ob.e; 
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Time> arr = new ArrayList<>();
		for(int i =0; i<n; i++)
		{
			int x = kb.nextInt();
			int y = kb.nextInt();
			arr.add(new Time(x, y));
		}
		System.out.println(solution(arr,n));
	}

}
