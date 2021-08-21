package algorithm_Study.dynamic_programming_sec10;

import java.util.Scanner;

/*
ö���� ����� ���� �� �� ���� �� ��� �Ǵ� �� ��ܾ� �ö󰣴�. ���� �� 4����� �����ٸ� �� ����� ����

1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2 �� 5�����̴�.

�׷��ٸ� �� N����� �� ö���� �ö� �� �ִ� ����� ���� �� �����ΰ�?

Image1.jpg


�Է�
ù° ���� ����� ������ �ڿ��� N(3��N��35)�� �־����ϴ�.


���
ù ��° �ٿ� �ö󰡴� ����� ���� ����մϴ�.


���� �Է� 1 
7

���� ��� 1
21

 */
public class upstairs_01 {
	static int[] dy;
	static int solution(int n)
	{
		dy[1] = 1; //ù��° ��� ����� ��
		dy[2] = 2; //�ι�° ��� ����� ��
		for(int i = 3; i<=n ; i++) //����° ��� ���� 
		{
			dy[i] = dy[i-2] + dy[i-1];
		}
		return dy[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		dy = new int[n+1];
		System.out.println(solution(n));
	}

}
