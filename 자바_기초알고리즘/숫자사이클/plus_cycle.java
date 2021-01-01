package jinsscoding;

public class plus_cycle {

	public static void main(String[] args) {
		//N이 주어졌을 때 N의 사이클의 길이를 구하시오. (1<=N<=100)
		//입력 : 26
		// 정답: 4 (26시작 2+6=8 -> 68 6+8 = 14 -> 84 8+4 = 12 -> 42 4+2 =>6 =>26
		
		//05 => 0+5=5 => 55 5+5=10 => 50 5+0 = 05 3회
		//42 => 4+2=6 => 26 2+6 => 68 => 84 => 42 4회
		int n = 26;
		int res = n;
		int cnt = 0;
		int tmp = 0;
		
		do {
			tmp = res/10 + res%10;
			res = res%10*10 + tmp%10;
			cnt ++;
		}while(n!=res);
		System.out.println(cnt);

	}

}
