package jinsscoding;

public class Palindrome {

	public static void main(String[] args) {
		// 입력된 수가 팰린드롬인지 판별하시오.
		// Ex: 입력: 12321  (가운데인 3을 기준으로 대칭인 문자를 의미)
		// 정답 : True
			
		String n = "12321";
		
		int len = n.length();
		int flag = 0;
		
		for(int i=0; i<len/2 ;i++) {
			if(n.charAt(i) == n.charAt(len-i-1)) {
				flag++;
			}
		}
		if(flag==len/2) {
			System.out.println("팰린드롬 숫자 입니다.");
		}
		else{
			System.out.println("팰린드롬 숫자가 아닙니다.");
		}
		flag = 0;
	}

}
