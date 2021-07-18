package level1;

import java.util.Arrays;
import java.util.Collections;


/*
 * 
 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

제한 사항
str은 길이 1 이상인 문자열입니다.
입출력 예
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
