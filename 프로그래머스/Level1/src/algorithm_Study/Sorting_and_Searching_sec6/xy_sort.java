package algorithm_Study.Sorting_and_Searching_sec6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 7. ��ǥ ����
����

N���� ������ ��ǥ(x, y)�� �־����� ��� ��ǥ�� ������������ �����ϴ� ���α׷��� �ۼ��ϼ���.
���ı����� ���� x���� ���ؼ� �����ϰ�, x���� ���� ��� y���� ���� �����մϴ�.

�Է�
ù° �ٿ� ��ǥ�� ������ N(3<=N<=100,000)�� �־����ϴ�.
�� ��° �ٺ��� N���� ��ǥ�� x, y ������ �־����ϴ�. x, y���� ����� �Էµ˴ϴ�.

���
N���� ��ǥ�� �����Ͽ� ����ϼ���.

���� �Է� 1 
5
2 7
1 3
1 2
2 5
3 6
���� ��� 1

1 2
1 3
2 5
2 7
3 6
 */

//��ǥ����

class Point implements Comparable<Point>
{
	public int x, y;
	
	Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Point o) { //���� ������ ��ƾ���
		// TODO Auto-generated method stub
		//o.x => �ݵǼ� ���� �Ű����� ��ü�� ��
		if(this.x==o.x)
			return this.y-o.y;       //���� this ��ü�� �տ��ְ�, �Ű������� �Ѿ�� ������Ʈ ��ü�� �ڿ� ������  
		else
		{
			return this.x-o.x;
		}
	}
	
}

public class xy_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Point> arr = new ArrayList<>();
		
		for(int i=0;i<n;i++)
		{
			int x = kb.nextInt();
			int y = kb.nextInt();
			arr.add(new Point(x,y));
		}
		
		Collections.sort(arr); //Comparable�� ���ؼ�, Point��ü�� ���� ��Ŵ - CompareTo
		for(Point o : arr)
		{
			System.out.println(o.x+" "+o.y);
		}
	}

}
