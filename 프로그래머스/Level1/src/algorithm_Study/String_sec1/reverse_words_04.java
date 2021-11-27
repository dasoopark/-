package algorithm_Study.String_sec1;

import java.util.ArrayList;
import java.util.Scanner;

/*
 4. �ܾ� ������
����

N���� �ܾ �־����� �� �ܾ ������ ����ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù �ٿ� �ڿ��� N(3<=N<=20)�� �־����ϴ�.

�� ��° �ٺ��� N���� �ܾ �� �ٿ� �ϳ��� �־����ϴ�. �ܾ�� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.


���
N���� �ܾ �Էµ� ������� �� �ٿ� �ϳ��� ����� ����մϴ�.


���� �Է� 1 

3
good
Time
Big
���� ��� 1

doog
emiT
giB
 */
public class reverse_words_04 {
	
		public static ArrayList<String> solution(int n, String[] str)
		{
			ArrayList<String> answer = new ArrayList<>();
			
			for(String x : str)
			{
				String tmp =  new StringBuilder(x).reverse().toString(); //������ ���� => x // ���� ���� �ڡ�
				answer.add(tmp);
			}
			
			return answer;
		}
		
		public static ArrayList<String> solution_word(int n, String[] str) // ��� �������� ó���� ������ �ٲ㰡����
		{
			ArrayList<String> answer = new ArrayList<>();
			
			for(String x : str)
			{
				char[] s = x.toCharArray();
				int lt= 0, rt = x.length()-1;
				
				while(lt<rt)
				{
					char tmp = s[lt];
					s[lt] = s[rt];
					s[rt] = tmp;
					lt++;
					rt--;
				}
				String tmp=String.valueOf(s);
				answer.add(tmp);
			}
		
			return answer;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String [] str = new String[n];
		
		for(int i=0; i<n; i++)
		{
			str[i] = kb.next();
		}
		
		for(String x : solution_word(n, str))
		{
			System.out.println(x);
		}

	}

}
