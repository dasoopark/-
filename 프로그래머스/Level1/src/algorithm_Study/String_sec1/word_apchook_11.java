package algorithm_Study.String_sec1;

import java.util.Scanner;

/*
 11. ���ڿ� ����
����

���ĺ� �빮�ڷ� �̷���� ���ڿ��� �Է¹޾� ���� ���ڰ� �������� �ݺ��Ǵ� ��� �ݺ��Ǵ�

���� �ٷ� �����ʿ� �ݺ� Ƚ���� ǥ���ϴ� ������� ���ڿ��� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�� �ݺ�Ƚ���� 1�� ��� �����մϴ�.


�Է�
ù �ٿ� ���ڿ��� �־�����. ���ڿ��� ���̴� 100�� ���� �ʴ´�.


���
ù �ٿ� ����� ���ڿ��� ����Ѵ�.


���� �Է� 1 

KKHSSSSSSSE
���� ��� 1

K2HS7E
���� �Է� 2 

KSTTTSEEKFKKKDJJGG
���� ��� 2

KST3SE2KFK3DJ2G2
 */
public class word_apchook_11 {
	public static String solution(String s)
	{
	String answer ="";
	s=s+ " "; //�������� ��Ÿ�� �� ���ڿ� �߰�
	int cnt = 1;
		for(int i=0; i<s.length()-1;i++) //���� ������ i�� �����ϹǷ� s.length()-1 ����� ��
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				cnt++;
			}
			else
			{
				answer+=s.charAt(i);
				if(cnt>1)
				{
					answer+=String.valueOf(cnt);
					cnt=1;
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(solution(str));

	}

}
