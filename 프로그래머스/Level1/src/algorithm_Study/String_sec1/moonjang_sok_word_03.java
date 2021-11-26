package algorithm_Study.String_sec1;

import java.util.Scanner;

/*
 3. 문장 속 단어
설명

한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.

문장속의 각 단어는 공백으로 구분됩니다.


입력
첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.


출력
첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한

단어를 답으로 합니다.


예시 입력 1 

it is time to study
예시 출력 1

study
 */
public class moonjang_sok_word_03 {
	
	public static String solution_split(String str)
	{
		String answer = "";
		int m = Integer.MIN_VALUE;
		String[] s = str.split(" "); // 띄어쓰기를 기준으로 문자열 구준 s 배열에 집어 넣음
		for(String x : s)
		{
			int len = x.length();
			if(len>m)
			{
				m = len;
				answer = x;
			}
			
		}
		
		return answer;
	}
	
	public static String solution_indexof(String str)
	{
		String answer= ""; //indexof => 띄어쓰는 곳의 위치를 말해줌
		int m = Integer.MIN_VALUE;
		int pos;
		
		while((pos=str.indexOf(' '))!=-1){ //띄어쓰기를 발견하면 해당 인덱스 반환(띄어쓰기 된 인덱스) 못하면은 -1을 반환
			String tmp = str.substring(0, pos); //0번부터 pos전까지 ( pos-1까지 인덱스 )
			int len = tmp.length();
			if(len>m) // 같다고>= 하면 가장 앞에서부터 기준이 되는것에 벗어나서 같다고하면 안됨 , 뒤쪽 단어가 답이 되버림
			{
				m = len;
				answer=tmp;
			}
			str = str.substring(pos+1); //띄어쓰기 후 그 앞에 단어부터 재정립 it is time  => is time 부터 시작 
		}
		if(str.length()>m)
		{
			answer = str; //마지막 단어 처리 해야함!
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		//System.out.println(solution_split(str));
		System.out.println(solution_indexof(str));
	}

}
