package level1;

/*
 String�� �迭 seoul�� element�� "Kim"�� ��ġ x�� ã��, "�輭���� x�� �ִ�"�� String�� ��ȯ�ϴ� �Լ�,
 solution�� �ϼ��ϼ���. seoul�� "Kim"�� ���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.

���� ����
seoul�� ���� 1 �̻�, 1000 ������ �迭�Դϴ�.
seoul�� ���Ҵ� ���� 1 �̻�, 20 ������ ���ڿ��Դϴ�.
"Kim"�� �ݵ�� seoul �ȿ� ���ԵǾ� �ֽ��ϴ�.

����� ��
seoul	return
["Jane", "Kim"]	"�輭���� 1�� �ִ�"
 */

public class seoung_findkim {

	static String findkin(String[] seoul)
	{
		 String answer = "";
	        String kim = "Kim";
	        
	        for(int i=0;i<seoul.length;i++)
	        {
	            if(seoul[i].equals(kim))
	            {
	                answer = "�輭���� "+i+"�� �ִ�";
	                break;
	            }
	        }
	        return answer;
	}
	
	public static void main(String[] args) {
		String[] test = {"Queen", "Tod", "Kim"};
		System.out.println(findkin(test));
	}

}
