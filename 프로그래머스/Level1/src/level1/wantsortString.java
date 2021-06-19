package level1;

import java.util.ArrayList;
import java.util.Collections;

/*
 ���ڿ��� ������ ����Ʈ strings��, ���� n�� �־����� ��, �� ���ڿ��� �ε��� n��° ���ڸ� �������� �������� �����Ϸ� �մϴ�. 
 ���� ��� strings�� ["sun", "bed", "car"]�̰� n�� 1�̸� �� �ܾ��� �ε��� 1�� ���� "u", "e", "a"�� strings�� �����մϴ�.

���� ����
strings�� ���� 1 �̻�, 50������ �迭�Դϴ�.
strings�� ���Ҵ� �ҹ��� ���ĺ����� �̷���� �ֽ��ϴ�.
strings�� ���Ҵ� ���� 1 �̻�, 100������ ���ڿ��Դϴ�.
��� strings�� ������ ���̴� n���� Ů�ϴ�.
�ε��� 1�� ���ڰ� ���� ���ڿ��� ���� �� ���, ���������� �ռ� ���ڿ��� ���ʿ� ��ġ�մϴ�.
����� ��

strings					n	return
["sun", "bed", "car"]	1	["car", "bed", "sun"]
["abce", "abcd", "cdx"]	2	["abcd", "abce", "cdx"]
����� �� ����
����� �� 1
"sun", "bed", "car"�� 1��° �ε��� ���� ���� "u", "e", "a" �Դϴ�.
 �̸� �������� strings�� �����ϸ� ["car", "bed", "sun"] �Դϴ�.

����� �� 2
"abce"�� "abcd", "cdx"�� 2��° �ε��� ���� "c", "c", "x"�Դϴ�.
 ���� ���� �Ŀ��� "cdx"�� ���� �ڿ� ��ġ�մϴ�. 
"abce"�� "abcd"�� ���������� �����ϸ� "abcd"�� �켱�ϹǷ�,
 ���� ["abcd", "abce", "cdx"] �Դϴ�. 
 
 */
public class wantsortString {

	
	    public static String[] solution(String[] strings, int n) {
	    	String[] answer = new String[strings.length];
	    	
	    	//ArrayList ���
	    	ArrayList<String> array = new ArrayList<String>();
	    	
	    	for(int i=0; i<strings.length;i++)
	    	{
	    		array.add(strings[i].charAt(n)+strings[i]); 
	    	}
	    	Collections.sort(array);
	    	
	    	for(int i=0 ; i<array.size();i++)
	    	{
	    		answer[i] = array.get(i).substring(1); //�ߺ� ���� =0, ���ڿ� 1���� ¥����
	    	}
	        return answer;
	    }
	
	
	public static void main(String[] args) {
		String[] string = new String[]{"abce", "abcd", "cdx"};
		System.out.println(solution(string,2));

	}

}


