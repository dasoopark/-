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
		boolean aFlag = true; //오름차순인지
		boolean bFlag = true; //내림차순인지
		
		if(input[0] != 1) { 	//오름차순은 제일 작은 숫자가 앞에 와 있어야 함
			aFlag = false;
		}
		
		for(int i = 1; i<input.length-1;i++) { //밑에 input[i+1]로 인해 범위를 벗어날 수 있으므로 -1해줌
			if(input[i] - input[i+1] != -1) {
				aFlag = false;
				break;
			}
		}
		
		
		
		if(input[0] != 8) { //내림차순이면 맨앞에 최대값(8)이 와야함
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
