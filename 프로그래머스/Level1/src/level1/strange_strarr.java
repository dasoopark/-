package level1;

/*
 ���ڿ� s�� �� �� �̻��� �ܾ�� �����Ǿ� �ֽ��ϴ�. �� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ� �ֽ��ϴ�. 
 �� �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.

���� ����
���ڿ� ��ü�� ¦/Ȧ�� �ε����� �ƴ϶�, �ܾ�(������ ����)���� ¦/Ȧ�� �ε����� �Ǵ��ؾ��մϴ�.
ù ��° ���ڴ� 0��° �ε����� ���� ¦����° ���ĺ����� ó���ؾ� �մϴ�.
����� ��
s					return
"try hello world"	"TrY HeLlO WoRlD"
����� �� ����
"try hello world"�� �� �ܾ� "try", "hello", "world"�� �����Ǿ� �ֽ��ϴ�.
 �� �ܾ��� ¦����° ���ڸ� �빮�ڷ�, Ȧ����° ���ڸ� �ҹ��ڷ� �ٲٸ� "TrY", "HeLlO", "WoRlD"�Դϴ�.
  ���� "TrY HeLlO WoRlD" �� �����մϴ�.
 */
public class strange_strarr {
	
	static String test(String s)
	{
		String answer = "";
		String str[] = s.split("");
        String space =" ";
        int cnt = 0;
        
        for(int i=0; i<str.length;i++)
        {
            if(str[i].equals(space))
            {
                cnt = 0;
            }
        else if(cnt % 2 ==0)
            {
                str[i]=str[i].toUpperCase();
               cnt++;
            }
        else
            {
              
                str[i]=str[i].toLowerCase();
                 cnt++;
            }
            answer+=str[i];
        }
    
        return answer;
	}

	public static void main(String[] args) {
		String s = "try hello world";
		System.out.println(test(s));
	}

}
