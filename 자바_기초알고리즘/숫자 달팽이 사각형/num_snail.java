package jinsscoding;

public class num_snail {

	public static void main(String[] args) {
		/*
		 	������ ���
		 	1  2  3  4  5
		 	16 17 18 19 6
		 	15 24 25 20 7
		 	14 23 22 21 8 
		 	13 12 11 10 9
		 */
		int n = 7;
		int arr[][] = new int[10][10];
		
		int x = 0;
		int y = 0;
		int num = 1;
		int f = n;
		
		for(int i =0; i<2*n-1 ; i++) {
			switch( i % 4 ) {
			case 0: //������
				 for(int k = 0; k<f ; k++) {
					 arr[y][x] = num;
					 x++;
					 num++;
				 }
				 x--; //(x���󺹱�)
				 y++; //(56789�� ������ �Ϸ��� y�� 1 Ŀ���ִ� ���¿��� �����ؾ���)
				 f--;
				break;
			case 1:	//�Ʒ�
				 for(int k = 0; k<f ; k++) {
					 arr[y][x] = num;
					 y++;
					 num++;
				 }
				 y--; // �ݺ������� 1 �� ���� ���� ���ִ°� y���󺹱�
				 x--; // 9-> 10,11,12,13  �̹Ƿ� x��ĭ �մ����
				 //f-- �� �� �ʿ䰡 ���� (6789 , 10 11 12 13 �� 4ȸ�̹Ƿ�)
				
				break;
			case 2:	//����
				 for(int k = 0; k<f ; k++) {
					 arr[y][x] = num; 
					 x--;
					 num++;
				 }
				 y--; //���� �ö���� �ϹǷ� ��ĭ �÷���
				 x++; //x�� �ݺ������� ��ĭ�� ����Ƿ�  ����ȸ��
				 f--; //��ĭ �� ���� ���Ƿ� ī��Ʈ �ٿ���
				break;
			case 3:	//����
				 for(int k = 0; k<f ; k++) {
					 arr[y][x] = num; 
					 y--;
					 num++;
				 }
				 y++; //���� �ö���� �ϹǷ� ��ĭ �÷���
				 x++; //�ö󰣴��� �ٽ� ���������� �̵��ؾ� �ϹǷ� x++����
			
				break;	
			}
		}
		
		for(int i =0 ;i<n ;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}

}
