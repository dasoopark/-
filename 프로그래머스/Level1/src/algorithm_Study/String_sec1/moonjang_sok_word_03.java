package algorithm_Study.String_sec1;

import java.util.Scanner;

/*
 3. ���� �� �ܾ�
����

�� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷��� �ۼ��ϼ���.

������� �� �ܾ�� �������� ���е˴ϴ�.


�Է�
ù �ٿ� ���̰� 100�� ���� �ʴ� �� ���� ������ �־����ϴ�. ������ ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.


���
ù �ٿ� ���� �� �ܾ ����Ѵ�. ���� ���̰� �� �ܾ �������� ��� ����ӿ��� ���� ���ʿ� ��ġ��

�ܾ ������ �մϴ�.


���� �Է� 1 

it is time to study
���� ��� 1

study
 */
public class moonjang_sok_word_03 {
	
	public static String solution_split(String str)
	{
		String answer = "";
		int m = Integer.MIN_VALUE;
		String[] s = str.split(" "); // ���⸦ �������� ���ڿ� ���� s �迭�� ���� ����
		for(String x : s)
		{
			int len = x.length();
			if(len>m)
			{
				m = len;
				answer = x;
			}
			
		}
		
		return answer;
	}
	
	public static String solution_indexof(String str)
	{
		String answer= ""; //indexof => ���� ���� ��ġ�� ������
		int m = Integer.MIN_VALUE;
		int pos;
		
		while((pos=str.indexOf(' '))!=-1){ //���⸦ �߰��ϸ� �ش� �ε��� ��ȯ(���� �� �ε���) ���ϸ��� -1�� ��ȯ
			String tmp = str.substring(0, pos); //0������ pos������ ( pos-1���� �ε��� )
			int len = tmp.length();
			if(len>m) // ���ٰ�>= �ϸ� ���� �տ������� ������ �Ǵ°Ϳ� ����� ���ٰ��ϸ� �ȵ� , ���� �ܾ ���� �ǹ���
			{
				m = len;
				answer=tmp;
			}
			str = str.substring(pos+1); //���� �� �� �տ� �ܾ���� ������ it is time  => is time ���� ���� 
		}
		if(str.length()>m)
		{
			answer = str; //������ �ܾ� ó�� �ؾ���!
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		//System.out.println(solution_split(str));
		System.out.println(solution_indexof(str));
	}

}
