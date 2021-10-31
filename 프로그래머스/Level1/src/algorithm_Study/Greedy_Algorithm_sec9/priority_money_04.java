package algorithm_Study.Greedy_Algorithm_sec9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
 4. 최대 수입 스케쥴(PriorityQueue 응용문제)
설명
현수는 유명한 강연자이다. N개이 기업에서 강연 요청을 해왔다. 각 기업은 D일 안에 와서 강연을 해 주면 M만큼의 강연료를 주기로 했다.
각 기업이 요청한 D와 M를 바탕으로 가장 많을 돈을 벌 수 있도록 강연 스케쥴을 짜야 한다.
단 강연의 특성상 현수는 하루에 하나의 기업에서만 강연을 할 수 있다.

입력
첫 번째 줄에 자연수 N(1<=N<=10,000)이 주어지고, 다음 N개의 줄에 M(1<=M<=10,000)과 D(1<=D<=10,000)가 차례로 주어진다.


출력
첫 번째 줄에 최대로 벌 수 있는 수입을 출력한다.


예시 입력 1 

6
50 2
20 1
40 2
60 3
30 3
30 1
예시 출력 1

150
 */

class Lecture implements Comparable<Lecture>
{
	public int money;
	public int time;
	Lecture(int money, int time)
	{
		this.money = money;
		this.time = time;
	}
	
	@Override
	public int compareTo(Lecture ob)
	{
		return ob.time - this.time; //ArrayList 내림차순 정렬
	}
}
public class priority_money_04 {
	static int n, max =Integer.MIN_VALUE;
	static int solution(ArrayList<Lecture> arr)
	{
		int answer = 0;
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		//Collections.reverseOrder를 해야 큰 값을 우선순위로 꺼내주게 됨!!!!!!!!!!!!!!!!!
		//기본은 낮은 값을 우선순위로 꺼내줌 (Collections.reverseOrder 없을 때)
		
		Collections.sort(arr);
		
		int j = 0;
		for(int i = max; i>=1 ;i--) //i가 가장 큰 날부터 1일까지 줄어듬
		{
			for( ; j<n ; j++)
			{
				if(arr.get(j).time< i) // 가장 큰 날보다 작은 날 짜 일때 브레이크 해주세요(OneNote참고)
					break; 			// Ex) => 3일에서 2로 바뀔 때 말하는거임 
				 pQ.offer(arr.get(j).money); // time마다 money 넣어줌 
			}
		
			if(!pQ.isEmpty())
			{
				answer += pQ.poll(); //가장 큰 값 꺼내서 넣게됨.- reversOrder때문
			}
			
		}
		return answer;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		ArrayList<Lecture> arr = new ArrayList<>();
		for(int i =0; i<n; i++)
		{
			int m = kb.nextInt();
			int d = kb.nextInt();
			arr.add(new Lecture(m, d));
			if(d>max)
			{
				max =d; //제일 큰 날짜 부터 돌기 위해서 (3일 2일 1일) => max = 3일 (Onenote참고)
			}
		}
		System.out.println(solution(arr));

	}

}
