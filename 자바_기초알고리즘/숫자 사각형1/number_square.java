package jinsscoding;

public class number_square {

		//입력된 수(N) 만큼 N행 N열의 형태로 아래와 같이 출력되는 숫자 사각형을 출력
	
		/*
		 	입력: 4
		 	정답: 1 2 3 4
		 		 8 7 6 5
		 		 9 10 11 12
		 		 16 15 14 13
		 */
	public static void main(String[] args) {
		int n = 5;
		int arr[][] = new int[n][n];
		int num = 0;
		
		
		
		for(int i = 0; i< n; i++) {
			
			if(i % 2 == 0) {		//짝수번째 라인 
				for(int j =0; j<n ;j++) {
					arr[i][j] = i*n + j+1;
				}
				
			}
			else {
				for(int j=n-1; j>=0; j--) {
					arr[i][j] = i*n + n-j;
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
