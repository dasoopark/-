package algorithm_Study.dynamic_programming_sec10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 4. ���� ���� ž �ױ�
����

�ظ��� ���簢���� ������ü �������� ����Ͽ� ž�� �װ��� �Ѵ�. ž�� ������ �� ���� �Ʒ����� ���� �����鼭 ����� ����.

�Ʒ��� ������ �����ϸ鼭 ���� ���� ž�� ���� �� �ִ� ���α׷��� �ۼ��Ͻÿ�.

(����1) ������ ȸ����ų �� ����. ��, ������ �ظ����� ����� �� ����.

(����2) �ظ��� ���̰� ���� ������ ������, ���� ���԰� ���� ������ ����.

(����3) �������� ���̴� ���� ���� �ִ�.

(����4) ž�� ���� �� �ظ��� ���� ���� ���� �ظ��� ���� ������ ���� �� ����.

(����5) ���԰� ���ſ� ������ ���԰� ������ ���� ���� ���� �� ����.


�Է�
�Է� ������ ù° �ٿ��� �Էµ� ������ ���� �־�����. �Է����� �־����� ������ ���� �ִ� 100���̴�.
��° �ٺ��ʹ� �� �ٿ� �� ���� ������ ���� ������ ���� �ظ��� ����, ������ ���� �׸��� ���԰� ���ʴ�� ���� ������ �־�����.
�� ������ �ԷµǴ� ������� 1���� �������� ��ȣ�� ������. ������ ����, ���� ���Դ� 10,000���� �۰ų� ���� �ڿ����̴�.


���
ù ��° �ٿ� ���� ���� ���� �� �ִ� ž�� ���̸� ����Ѵ�.


���� �Է� 1 
// ���� ���� ����
5
25 3 4 
4 4 6
9 2 3
16 2 5
1 5 2

���� ��� 1
10
��Ʈ


 */

class Brick implements Comparable<Brick>
{
	public int s, h, w;
	Brick(int s, int h, int w)
	{
		this.s = s;
		this.h = h;
		this.w = w;
	}
	@Override
	public int compareTo(Brick o) //���� ������ ����
	{
		return o.s - this.s;
	}
}
public class make_highest_top_04 {
	static int[] dy;
	static int solution(ArrayList<Brick> arr)
	{
		int answer = 0;
		Collections.sort(arr);
		dy[0]=arr.get(0).h; // ���� ���̰� ���� ���� (�ƹ��͵� �� �����Ƿ�)
		answer= dy[0];
		
		for(int i=1;i<arr.size();i++)
		{
			int max_h = 0;
			for(int j=i-1; j>=0;j--)
			{
				//i��°�� ���� ���� ���̴� ��, j�� �� ��
				if(arr.get(j).w>arr.get(i).w && dy[j]>max_h)
				{
					max_h = dy[j];
				}
			}
			dy[i] = max_h+arr.get(i).h; 
			answer = Math.max(answer, dy[i]);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Brick> arr = new ArrayList<>();
		
		dy = new int[n];
		for(int i =0; i<n;i++)
		{
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			arr.add(new Brick(a,b,c));
		}
		System.out.println(solution(arr));

	}

}
