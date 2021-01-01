package jinsscoding;

public class reverse_string {

	public static void main(String[] args) {
		// 입력된 문자열을 뒤집어서 출력하시오
		// 입력:ADEFH
		// 정답:HFEDA
		
		String n = "ADEFH";
		char str[] = n.toCharArray();
		int len = str.length;
		char tmp;
		
		for (int i = 0; i<len/2 ; i++) {
			tmp = str[i];
			str[i] = str[len-i-1];
			str[len-i-1] = tmp;
		}
		n = new String(str);
		System.out.println(n);

	}

}
