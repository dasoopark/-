package jinsscoding;

import java.util.Scanner;

public class num_stairs {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input[] = new int[8];
		
		for(int i=0;i<input.length;i++) {
			input[i] = scan.nextInt();
		}
		distinct(input);
	}
	
	public static void distinct(int input[]) {
		boolean aFlag = true; //������������
		boolean bFlag = true; //������������
		
		if(input[0] != 1) { 	//���������� ���� ���� ���ڰ� �տ� �� �־�� ��
			aFlag = false;
		}
		
		for(int i = 1; i<input.length-1;i++) { //�ؿ� input[i+1]�� ���� ������ ��� �� �����Ƿ� -1����
			if(input[i] - input[i+1] != -1) {
				aFlag = false;
				break;
			}
		}
		
		
		
		if(input[0] != 8) { //���������̸� �Ǿտ� �ִ밪(8)�� �;���
			bFlag = false;
		}
		
		for(int i = 1; i<input.length-1;i++) {
			if(input[i]-input[i+1]!=1) {
				bFlag=false;
				break;
			}
		}
		
		if(aFlag)
			System.out.println("ascending");
		else if(bFlag)
			System.out.println("descending");
		else
			System.out.println("mixed");
	}
}
