package level1;

import java.util.Arrays;
import java.util.Collections;


/*
 * 
 * ���ڿ� s�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
s�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ �����մϴ�.

���� ����
str�� ���� 1 �̻��� ���ڿ��Դϴ�.
����� ��
	s		return
"Zbcdefg"	"gfedcbZ"
 */
public class String_desc {

	  static String solution(String s) {
	        String answer = "";
	        Character[] str = new Character[s.length()];
	        for(int i=0; i<str.length;i++)
	        {
	            str[i] = s.charAt(i);
	        }
	        
	       Arrays.sort(str, Collections.reverseOrder());
	        for(int i=0; i<str.length;i++)
	        {
	            answer += str[i];
	        }
	        return answer;
	    }
	  
	public static void main(String[] args) {
		String s = "Zbcdefg";
		System.out.println(solution(s));

	}

}
