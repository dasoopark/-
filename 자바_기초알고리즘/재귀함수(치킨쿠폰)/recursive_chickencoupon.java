package jinsscoding;

import java.util.Scanner;

public class recursive_chickencoupon {
	
	public static void doFunc(int coupon, int stamp, int k, int ans)
	{
		if(coupon > 0)
		{
			coupon--; //ġŲ�� ��Ű�� ������ ���̰� 
			stamp++; //������ ���� ������ �ö�
			ans++; //ġŲ ���� �� ����
			doFunc(coupon,stamp,k,ans);
			return;
		}
		else if(stamp>0)
		{
			if(stamp/k >0)
			{
				stamp -= k; //�������� �Է���k ��ŭ ���̸� ġŲ �������� ��ų �� ����
				coupon++; //�������� k��ŭ ���̸� ���� ����
				doFunc(coupon, stamp, k, ans);
			}
		}
		
		if(coupon == 0 && stamp/k ==0)
		{
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		/*
		 �����̴� ġŲ �� ������ �ֹ��� �� �ִ� ġŲ ������ n�� ������ �ִ�. �� ġŲ�������� ġŲ�� �� ����
		 �ֹ��� �� ���� ������ �ϳ��� ��� �ִµ�, ������ k�� ������ ġŲ ���� �� ������ ��ȯ�� �� �ִ�.
		 �����̰� ���� ���� �ִ� ġŲ �������� ġŲ�� �ִ� �� ������ ���� �� �ִ��� ���Ͽ���. �� ġŲ�� �ֹ��ϱ�
		 ���ؼ��� �ݵ�� ġŲ ������ ���� �־�� �Ѵ�.
		 
		 �Է�:n k
		 ���: ����
		 
		 ���� �Է�: 
		 4 3
		 10 3
		 100 5
		 
		 ���
		 5
		 14 ( 10 + 3 + 1)
		 124 
		 */
		int k;
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		k = s.nextInt();
		int coupon = n;
		
		doFunc(coupon, 0, k, 0);
	}

}
