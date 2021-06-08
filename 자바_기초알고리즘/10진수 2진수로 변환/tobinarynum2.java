package jinsscoding;

public class tobinarynum {

	// 목표 : 10진수를 2진수로 변환
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * \ 19 / 2 9...1 9 / 2 4...1 4 / 2 2...0 2 / 2 1...0 1 / 2 0...1
		 * 
		 * 19 => 10011
		 */

		int inputNum = 19;
		int bin[] = new int[100]; // 나머지 값이 들어가는곳

		int i = 0; // bin 배열 카운팅
		int mok = inputNum;

		while (mok > 0) {
			bin[i] = mok % 2;
			mok /= 2;
			i++;
		}
		i--;

		for (; i >= 0; i--) {
			System.out.println(bin[i]);
		}
	}
}
