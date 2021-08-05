package algorithm_Study.Greedy_Algorithm_sec9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Ǯ�� ONENOTE ����
 * 
 * SEC6_7 ��ǥ ���� �����ϰ� �� ��!
 * Ű�� �������� �������� / 
 * 
 ����

������ ���� �����Դϴ�. ������ ���� ������ ���߰��� �°�, N���� �����ڰ� ������ �߽��ϴ�.

������ �� �������� Ű�� ������ ������ �˰� �ֽ��ϴ�.

������ ���� ���� ���� ��Ģ�� ������ ���� ���߽��ϴ�.

��A��� �����ڸ� �ٸ� ��� �����ڿ� �ϴ��� ���ؼ� Ű�� ������ ��� A������ ���� ����(ũ��, ���̴�) �����ڰ�

�����ϸ� A�����ڴ� Ż���ϰ�, �׷��� ������ ���ߵȴ�.��

N���� �����ڰ� �־����� ���� ���߿�Ģ���� �ִ� �� ���� ������ ������ �� �ִ��� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.


�Է�
ù° �ٿ� �������� �� N(5<=N<=30,000)�� �־����ϴ�.

�� ��° �ٺ��� N���� �� �ɷ�ġ�� ������ �ɷ�ġ ������ ���ʷ� �־����ϴ�.

�� ������ �򵹴ɷ�ġ�� ��� �ٸ���, ������ �ɷ�ġ�� ��� �ٸ��ϴ�. �ɷ�ġ ���� 1,000,000������ �ڿ����Դϴ�.


���
ù° �ٿ� �ٵ� ������ ������ �ִ� �ο��� ����ϼ���.

���� �Է� 1 
5
172 67
183 65
180 70
170 72
181 60

���� ��� 1
3

 */
//��ü�� �����ϱ� ���ؼ� Comparable �� ��� (Ư�� �ڷ����� �������� ��ü�� �����ϰ��� �� ��)
//Body ��ü => �Ȱ��� �־��ֱ�
class Body implements Comparable<Body>  //����6 ��ǥ���� ���� �������
{
	public int h, w;
	Body(int h, int w)
	{
		this.h = h;
		this.w = w;
	}
	@Override
	public int compareTo(Body o) //�������̵� �������
	{
		return o.h - this.h;
	}
}

public class ssireum_player_01 {

	static int solution(ArrayList<Body> arr, int n)
	{
		int cnt = 0;
		Collections.sort(arr); //���� ���� ����
		int max = Integer.MIN_VALUE; //���� ���� ������ ù�� ° ��� �ϱ� ���� (������ ī���� 
		for(Body ob : arr)
		{
			if(ob.w > max )
			{
				max = ob.w;
				cnt++;
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Body> arr = new ArrayList<>();
		for(int i=0; i<n;i++)
		{
			int h = kb.nextInt();
			int w = kb.nextInt();
			arr.add(new Body(h,w));
		}
		System.out.println(solution(arr,n));

	}

}
