package jinsscoding;

import java.util.Scanner;

public class recursive_chickencoupon {
	
	public static void doFunc(int coupon, int stamp, int k, int ans)
	{
		if(coupon > 0)
		{
			coupon--; //치킨을 시키면 쿠폰이 깎이고 
			stamp++; //쿠폰을 쓰면 도장이 올라감
			ans++; //치킨 먹은 수 증가
			doFunc(coupon,stamp,k,ans);
			return;
		}
		else if(stamp>0)
		{
			if(stamp/k >0)
			{
				stamp -= k; //스탬프는 입력한k 만큼 깎이면 치킨 쿠폰으로 시킬 수 있음
				coupon++; //스탬프가 k만큼 깎이면 쿠폰 증가
				doFunc(coupon, stamp, k, ans);
			}
		}
		
		if(coupon == 0 && stamp/k ==0)
		{
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		/*
		 강민이는 치킨 한 마리를 주문할 수 있는 치킨 쿠폰을 n장 가지고 있다. 이 치킨집에서는 치킨을 한 마리
		 주문할 때 마다 도장을 하나씩 찍어 주는데, 도장을 k개 모으면 치킨 쿠폰 한 장으로 교환할 수 있다.
		 강민이가 지금 갖고 있는 치킨 쿠폰으로 치킨을 최대 몇 마리나 먹을 수 있는지 구하여라. 단 치킨을 주문하기
		 위해서는 반드시 치킨 쿠폰을 갖고 있어야 한다.
		 
		 입력:n k
		 출력: 정답
		 
		 예제 입력: 
		 4 3
		 10 3
		 100 5
		 
		 출력
		 5
		 14 ( 10 + 3 + 1)
		 124 
		 */
		int k;
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		k = s.nextInt();
		int coupon = n;
		
		doFunc(coupon, 0, k, 0);
	}

}
