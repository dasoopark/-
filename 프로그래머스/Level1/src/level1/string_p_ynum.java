package level1;

/*
 �빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s�� �־����ϴ�. s�� 'p'�� ������ 'y'�� ������ ���� ������ True,
  �ٸ��� False�� return �ϴ� solution�� �ϼ��ϼ���. 'p', 'y'
   ��� �ϳ��� ���� ���� �׻� True�� �����մϴ�.\
   ��, ������ ���� �� �빮�ڿ� �ҹ��ڴ� �������� �ʽ��ϴ�.

���� ��� s�� "pPoooyY"�� true�� return�ϰ� 
"Pyy"��� false�� return�մϴ�.

���ѻ���
���ڿ� s�� ���� : 50 ������ �ڿ���
���ڿ� s�� ���ĺ����θ� �̷���� �ֽ��ϴ�.
����� ��
s			answer
"pPoooyY"	true
"Pyy"		false

����� �� ����
����� �� #1
'p'�� ���� 2��, 'y'�� ���� 2���� �����Ƿ� true�� return �մϴ�.

����� �� #2
'p'�� ���� 1��, 'y'�� ���� 2���� �ٸ��Ƿ� false�� return �մϴ�. 
  
 
 */
public class string_p_ynum {

	
	   public static boolean solution(String s) {
	        boolean answer = true;
	        
	        int pcnt = 0;
	        int ycnt = 0;
	        
	        for(int i=0; i<s.length();i++)
	        {
	            if(s.charAt(i) =='p' || s.charAt(i) =='P')
	                pcnt++;
	            if(s.charAt(i)=='y' || s.charAt(i)=='Y')
	                ycnt++;
	        }
	        
	        if(pcnt == ycnt){
	            answer = true;
	        }
	        else
	            answer = false;

	        return answer;
	    }
	
	
	public static void main(String[] args) {
		System.out.println(solution("pPoooyY"));
	}

}
