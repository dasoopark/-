package level1;

import java.util.ArrayList;
import java.util.Collections;

/*
 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 
 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.

제한 조건
strings는 길이 1 이상, 50이하인 배열입니다.
strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
모든 strings의 원소의 길이는 n보다 큽니다.
인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
입출력 예

strings					n	return
["sun", "bed", "car"]	1	["car", "bed", "sun"]
["abce", "abcd", "cdx"]	2	["abcd", "abce", "cdx"]
입출력 예 설명
입출력 예 1
"sun", "bed", "car"의 1번째 인덱스 값은 각각 "u", "e", "a" 입니다.
 이를 기준으로 strings를 정렬하면 ["car", "bed", "sun"] 입니다.

입출력 예 2
"abce"와 "abcd", "cdx"의 2번째 인덱스 값은 "c", "c", "x"입니다.
 따라서 정렬 후에는 "cdx"가 가장 뒤에 위치합니다. 
"abce"와 "abcd"는 사전순으로 정렬하면 "abcd"가 우선하므로,
 답은 ["abcd", "abce", "cdx"] 입니다. 
 
 */

/* 
 코드 풀이
 1. 반환할 배열 answer의 길이는 strings배열과 같으므로 strings.length로 지정한다.

2. n번째문자를 기존 문자열에 붙여 만든 새로운 문자열을 넣을 ArrayList를 생성한다.

3. strings의 길이만큼 반복문을 사용해 새로운 문자열(strings[i].charAt(n) + strings[i])을 넣어준다.

   (ex) sun -> usun, car -> acar)

4. Collections.sort()함수로 정렬한다.

5. 정렬된 배열을 substring을 사용해 1~마지막으로 자른다.
 */
public class wantsortString {

	
	    public static String[] solution(String[] strings, int n) {
	    	String[] answer = new String[strings.length];
	    	
	    	//ArrayList 사용
	    	ArrayList<String> array = new ArrayList<String>();
	    	
	    	for(int i=0; i<strings.length;i++)
	    	{
	    		array.add(strings[i].charAt(n)+strings[i]); 
	    	}
	    	Collections.sort(array);
	    	
	    	for(int i=0 ; i<array.size();i++)
	    	{
	    		answer[i] = array.get(i).substring(1); //중복 문자 =0, 문자열 1부터 짜르기
	    	}
	        return answer;
	    }
	
	
	public static void main(String[] args) {
		String[] string = new String[]{"abce", "abcd", "cdx"};
		System.out.println(solution(string,2));

	}

}


