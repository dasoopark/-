package level1;

import java.util.Arrays;
import java.util.Collections;

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
