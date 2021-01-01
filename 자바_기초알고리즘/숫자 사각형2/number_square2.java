package jinsscoding;

public class number_square2 {
	
	//입력된 수(N) 만큼 N행 N열의 형태로 아래와 같이 출력되는 숫자 사각형을 출력
	
			/*
			 	입력: 4
			 	정답: 1 5 9 13
			 		 2 6 10 14
			 		 3 7 11 15
			 		 4 8 12 16
			 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int arr[][] = new int[n][n];
		int num = 1;

		
		for(int i = 0; i< n; i++) {
			
			
			if(i%2==0) {
				for(int j=0; j<n ;j++)
				{
					arr[j][i] = i*n + j+1;
				}
			}
			
			else {
				for(int j=0; j<n ;j++)
				{
					arr[j][i] = i*n + j+1;
				}
			}
		}
		
		for(int i = 0; i<n; i++) {
			for(int j =0; j<n ; j++) {
				System.out.printf("%4d",arr[i][j]);
	
			}
			System.out.println();
		}
	}


}
