package jinsscoding;

public class recursiv_numcolor {

	static final int SIZE =5;
	static final int COLOR = 2;
	
	static final int [][]map = 
			   {{0,0,0,0,0},
				{0,0,1,1,0},
				{0,0,0,0,1},
				{0,0,0,0,0},
				{0,0,1,0,0}};
	
	public static void color(int x, int y)
	{
		if(map[x][y] != 1)
			map[x][y] = COLOR;
		
		if(x-1 >= 0 && map[x-1][y]!=COLOR && map[x-1][y] !=1) //왼쪽으로 가는 길 끝일 때 방지 (벽넘어감)
			color(x-1,y);
		if(x+1 <= SIZE-1 && map[x+1][y]!=COLOR && map[x+1][y] !=1) //오른쪽으로 가는 길 끝일 때 알기 
			color(x+1,y);
		if(y+1 <= SIZE-1 && map[x][y+1]!=COLOR && map[x][y+1] !=1) //아래쪽으로 가는 길 끝 알기
			color(x,y+1);
		if(y-1 >= 0 && map[x][y-1]!=COLOR && map[x][y-1] !=1) //위쪽으로 갈 때 넘어가지 않게 하기
			color(x,y-1);
		
	}
	
	public static void main(String[] args) {
		// 문제소개
		/*
		 	00000
		 	00110
		 	00001
		 	00000
		 	00100
		  
		  0을 모두 2로 색칠하시오. (단, 0은 어떻게든 모두 연결됨)
		  
		  정답:
		  22222
		  22112
		  22221
		  22222
		  22122
		 */
		
			for(int i =0;i<SIZE;i++) {
				for(int j=0;j<SIZE;j++) {
					System.out.print(map[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
			
			color(0,0);
			
			for(int i =0;i<SIZE;i++) {
				for(int j=0;j<SIZE;j++) {
					System.out.print(map[i][j]+" ");
				}
				System.out.println();
			}
	}
	
	

}
