package jinsscoding;

public class recursiv_danjisoo {
	static final int SIZE = 5;
	static final int APART = 1;
	
	static int apprtCnt = 0; //�� ������ �� ��� 
	static int []household = new int[10]; //�� ������ ������� �����ϱ� ���� �迭
	
	static int [][]map =
			   {{0,0,0,1,1},
				{0,0,0,0,1},
				{1,0,0,0,0},
				{1,1,0,0,0},
				{1,1,0,1,1}};
		
	
	public static void doFunc(int y, int x, int apartIndex) {
		map[y][x] = 0;
		household[apartIndex]++;
		
		if(x - 1 >= 0 && map[y][x-1] == APART) // x�� ��ȭ������ �Ѿ�� ��� ����  (����) 0,0,0,1,1
			doFunc(y, x-1, apartIndex); 
		if(x + 1 <= SIZE-1 && map[y][x+1] == APART) //x�� ������ ȭ������ �Ѿ�� ���  ���� 0,0,0,1,1 (����)
			doFunc(y, x+1, apartIndex); 
		if(y + 1 <= SIZE-1 && map[y+1][x] == APART) //y�� ȭ�� ������ Ƣ�� �Ѿ ��  ����
			doFunc(y+1, x, apartIndex);
		if(y - 1 >= 0 && map[y-1][x]==APART) //y�� ȭ�� ���� Ƣ�� �Ѿ �� ����
			doFunc(y-1, x, apartIndex);
	}
	public static void main(String[] args) {
		// �Էµ� ������ ���� �� ������ ������� ����Ͻÿ� (33�� ��ĥ�� ����)
		
		/*
		  �Է�: 00011
		  	  00001
		  	  10000
		  	  11000
		  	  11011
		  	  ����:3  ������
		  	    ����� 3 5 2 
		  	 �����¿츦 �������� 1�� �پ������� �ϳ��� ������ ��
		 */

		 for(int i = 0; i<SIZE; i++) {
			 for(int j=0; j<SIZE; j++) {
				 if(map[i][j] == 1) {
					 doFunc(i, j, apprtCnt);
					 apprtCnt++;
				 }
			 }
		 }
		 
		 System.out.println(apprtCnt);
		 for(int i : household) {
			 System.out.print(i+" ");
		 }
		 
		 
	}

}
