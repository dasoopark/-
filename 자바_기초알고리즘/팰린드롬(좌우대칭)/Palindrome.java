package jinsscoding;

public class Palindrome {

	public static void main(String[] args) {
		// �Էµ� ���� �Ӹ�������� �Ǻ��Ͻÿ�.
		// Ex: �Է�: 12321  (����� 3�� �������� ��Ī�� ���ڸ� �ǹ�)
		// ���� : True
			
		String n = "12321";
		
		int len = n.length();
		int flag = 0;
		
		for(int i=0; i<len/2 ;i++) {
			if(n.charAt(i) == n.charAt(len-i-1)) {
				flag++;
			}
		}
		if(flag==len/2) {
			System.out.println("�Ӹ���� ���� �Դϴ�.");
		}
		else{
			System.out.println("�Ӹ���� ���ڰ� �ƴմϴ�.");
		}
		flag = 0;
	}

}
