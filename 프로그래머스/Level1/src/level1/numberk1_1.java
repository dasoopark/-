package level1;

// 배열 array 의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때 , k번째에 있는 수를 구하려 한다
/*
예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면

array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
2에서 나온 배열의 3번째 숫자는 5입니다.
배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온
 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 
 array의 길이는 1 이상 100 이하입니다.
array의 각 원소는 1 이상 100 이하입니다.
commands의 길이는 1 이상 50 이하입니다.
commands의 각 원소는 길이가 3입니다.

입출력 예
array						commands							return
[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
입출력 예 설명
[1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다.
[1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.
[1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다.

 */
import java.util.*;
public class numberk1_1 {
	
	
	    public static int[] solution(int[] array, int[][] commands) {
	        
	        int[] answer = new int[commands.length];
	        int[] arr = new int[3];
	        ArrayList<Integer> temp = new ArrayList<>();
	        
	        for(int i=0; i<commands.length; i++)		// 2차원 배열 0, 1, 2 
	        {
	            for(int j=0; j<3;j++)
	            {
	                arr[j] = commands[i][j];
	            }
	            for(int j=arr[0]-1; j<arr[1];j++)		//배열 카운터 때문에 arr[0]-1 부터 시작 
	            {
	                temp.add(array[j]); 
	            }
	            Collections.sort(temp);
	            answer[i] = temp.get(arr[2]-1);		// 마찬 가지로 배열 카운터 때문에 값 저장할 때 1빼줘야함
	            for(int j =0; j<temp.size(); j++)
	            {
	                temp.clear();		//temp 값 리스트에 남아있는거 초기화 해줘야함
	            }
	        }
	        
	        return answer;
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,5,2,6,3,7,4};
		int [][]arr2 = {{2,5,3}, {4,4,1}, {1,7,3}};
		int []arr3;
		
		arr3 = solution(arr,arr2);
		System.out.println(arr3[0]+""+arr3[1]+""+arr3[2]);
	
	}

}
