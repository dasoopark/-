package level1;

/*
 ���ڿ� s�� ���̰� 4 Ȥ�� 6�̰�, ���ڷθ� �������ִ��� Ȯ�����ִ� �Լ�, solution�� �ϼ��ϼ���.
  ���� ��� s�� "a234"�̸� False�� �����ϰ� "1234"��� True�� �����ϸ� �˴ϴ�.

���� ����
s�� ���� 1 �̻�, ���� 8 ������ ���ڿ��Դϴ�.
	����� ��
	s		return
	"a234"	false
	"1234"	true
 */

public class basicString1_3 {
	

	    public static boolean solution(String s) {
	    	int len = s.length();
	    	if(len != 4 && len!=6)
	    		return false;
	    	for(int i =0; i<len;i++)
	    	{
	    		char c = s.charAt(i);
	    		if(c<'0'||c>'9')
	    			return false;
	    	}
	        boolean answer = true;
	        return answer;
	    }
	
	
	public static void main(String[] args) {
		System.out.println("�� ���ڿ���??:"+solution("1234"));

	}

}
