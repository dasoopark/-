package jinsscoding;

public class recursiv_danjisoo {
	static final int SIZE = 5;
	static final int APART = 1;
	
	static int apprtCnt = 0; //총 단지의 수 출력 
	static int []household = new int[10]; //각 단지의 세대수를 저장하기 위한 배열
	
	static int [][]map =
			   {{0,0,0,1,1},
				{0,0,0,0,1},
				{1,0,0,0,0},
				{1,1,0,0,0},
				{1,1,0,1,1}};
		
	
	public static void doFunc(int y, int x, int apartIndex) {
		map[y][x] = 0;
		household[apartIndex]++;
		
		if(x - 1 >= 0 && map[y][x-1] == APART) // x가 옆화면으로 넘어가는 경우 방지  (여기) 0,0,0,1,1
			doFunc(y, x-1, apartIndex); 
		if(x + 1 <= SIZE-1 && map[y][x+1] == APART) //x가 오른쪽 화면으로 넘어가는 경우  방지 0,0,0,1,1 (여기)
			doFunc(y, x+1, apartIndex); 
		if(y + 1 <= SIZE-1 && map[y+1][x] == APART) //y가 화면 밑으로 튀어 넘어갈 때  방지
			doFunc(y+1, x, apartIndex);
		if(y - 1 >= 0 && map[y-1][x]==APART) //y가 화면 위로 튀어 넘어갈 때 방지
			doFunc(y-1, x, apartIndex);
	}
	public static void main(String[] args) {
		// 입력된 단지의 수와 각 단지의 세대수를 출력하시오 (33번 색칠과 유사)
		
		/*
		  입력: 00011
		  	  00001
		  	  10000
		  	  11000
		  	  11011
		  	  정답:3  단지수
		  	    세대수 3 5 2 
		  	 상하좌우를 기준으로 1이 붙어있으면 하나의 단지로 봄
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
