package level1;


//��� ���� ��������

/*
���� ����
�ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.

���ѻ���
s�� ���̰� 1 �̻�, 100������ ��Ʈ���Դϴ�.
����� ��
s			return
"abcde"		"c"
"qwer"		"we"
*/
public class string_midstringget {

	static String answer(String s)
	{
		 String answer = "";
	        
	        if(s.length()%2==0)
	        {
	            answer = s.substring(s.length()/2-1,s.length()/2+1);
	        }
	        else
	        {
	            answer = s.substring(s.length()/2,s.length()/2+1);
	        }
	        
		return answer;
	}
	public static void main(String[] args) {
		String test ="abcde";
		String test2 = "qwer";
		System.out.println(answer(test));
		System.out.println(answer(test2));

	}

}
