package level1;

/*
 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
  예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

제한 사항
s는 길이 1 이상, 길이 8 이하인 문자열입니다.
	입출력 예
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
		System.out.println("이 문자열은??:"+solution("1234"));

	}

}
