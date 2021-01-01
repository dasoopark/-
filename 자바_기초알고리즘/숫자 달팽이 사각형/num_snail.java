package jinsscoding;

public class num_snail {

	public static void main(String[] args) {
		/*
		 	달팽이 출력
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
			case 0: //오른쪽
				 for(int k = 0; k<f ; k++) {
					 arr[y][x] = num;
					 x++;
					 num++;
				 }
				 x--; //(x원상복귀)
				 y++; //(56789로 진입을 하려면 y가 1 커져있는 상태에서 시작해야함)
				 f--;
				break;
			case 1:	//아래
				 for(int k = 0; k<f ; k++) {
					 arr[y][x] = num;
					 y++;
					 num++;
				 }
				 y--; // 반복문에서 1 더 많이 증가 되있는걸 y원상복귀
				 x--; // 9-> 10,11,12,13  이므로 x한칸 앞당겨줌
				 //f-- 는 할 필요가 없음 (6789 , 10 11 12 13 다 4회이므로)
				
				break;
			case 2:	//왼쪽
				 for(int k = 0; k<f ; k++) {
					 arr[y][x] = num; 
					 x--;
					 num++;
				 }
				 y--; //위로 올라가줘야 하므로 한칸 올려줌
				 x++; //x가 반복문에서 한칸더 까였으므로  원상회복
				 f--; //한칸 더 적게 가므로 카운트 줄여줌
				break;
			case 3:	//위로
				 for(int k = 0; k<f ; k++) {
					 arr[y][x] = num; 
					 y--;
					 num++;
				 }
				 y++; //위로 올라가줘야 하므로 한칸 올려줌
				 x++; //올라간다음 다시 오른쪽으로 이동해야 하므로 x++해줌
			
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
