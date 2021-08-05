package algorithm_Study.Sorting_and_Searching_sec6;

import java.util.Scanner;

/*
 ����

ĳ�ø޸𸮴� CPU�� �ֱ����ġ(DRAM) ������ ����� �ӽ� �޸𸮷μ� CPU�� ó���� �۾��� ������ ���Ҵٰ�
�ʿ��� �ٷ� ����ؼ� ó���ӵ��� ���̴� ��ġ�̴�. ���� ��ΰ� �뷮�� �۾� ȿ�������� ����ؾ� �Ѵ�.
ö���� ��ǻ�ʹ� ĳ�ø޸� ��� ��Ģ�� LRU �˰����� ������.
LRU �˰����� Least Recently Used �� ���ڷ� �������ڸ� ���� �ֱٿ� ������ ���� �� ������ �ǹ̸� ������ �ֽ��ϴ�.
ĳ�ÿ��� �۾��� ������ �� ���� �������� ������� ���� ���� �����ϰڴٴ� �˰����Դϴ�.


Image1.jpg  -==> OneNote ����  -- ����!!

ĳ���� ũ�Ⱑ �־�����, ĳ�ð� ����ִ� ���¿��� N���� �۾��� CPU�� ���ʷ� ó���Ѵٸ� N���� �۾��� ó���� ��
ĳ�ø޸��� ���¸� ���� �ֱ� ���� �۾����� ���ʴ�� ����ϴ� ���α׷��� �ۼ��ϼ���.

�Է�
ù ��° �ٿ� ĳ���� ũ���� S(3<=S<=10)�� �۾��� ���� N(5<=N<=1,000)�� �Էµȴ�.
�� ��° �ٿ� N���� �۾���ȣ�� ó�������� �־�����. �۾���ȣ�� 1 ~100 �̴�.

���
������ �۾� �� ĳ�ø޸��� ���¸� ���� �ֱ� ���� �۾����� ���ʷ� ����մϴ�.


���� �Է� 1 

5 9
1 2 3 2 6 2 3 5 7
���� ��� 1

7 5 3 2 6

 */
public class Least_Recently_Used_04 {
	static int[] solution(int size, int n, int[] arr)
	{
		int [] cache = new int[size];
		for(int x : arr)
		{
			//x�� ĳ�ÿ� �ִ��� Ȯ�� �ؾ��� Hit or Miss ����
			int pos = -1; //pos== �ε��� ��ȣ /��ġ
			
			for(int i=0; i<size;i++)
			{
				if(x==cache[i]) //Hit�϶�
				{
					pos = i; //Hit �϶��� �ε��� ���� �̽��϶��� �״�� -1
				}
			}
				if(pos == -1) //Miss ��Ȳ
				{
					for(int j=size-1;j>=1;j--)
					{
						cache[j]=cache[j-1]; // �̽��� ���� �������!! 
					}
					cache[0]=x;
				}
				else //Hit ó��
				{
					for(int j=pos;j>=1;j--)
					{
						cache[j]=cache[j-1]; // ��Ʈ�� ���� �ش� �ε������� �տ��ִ� �κи� �ڷ� �о��ָ�� ! 
					}
					cache[0]=x;
				}
				
			}
		
		
		return cache;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n;i++)
		{
			arr[i]=kb.nextInt();
		}
		for(int x : solution(s,n,arr))
		{
			System.out.print(x+ " ");
		}

	}

}
