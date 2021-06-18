package level1;

// �迭 array �� i��° ���ں��� j��° ���ڱ��� �ڸ��� �������� �� , k��°�� �ִ� ���� ���Ϸ� �Ѵ�
/*
���� ��� array�� [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3�̶��

array�� 2��°���� 5��°���� �ڸ��� [5, 2, 6, 3]�Դϴ�.
1���� ���� �迭�� �����ϸ� [2, 3, 5, 6]�Դϴ�.
2���� ���� �迭�� 3��° ���ڴ� 5�Դϴ�.
�迭 array, [i, j, k]�� ���ҷ� ���� 2���� �迭 commands�� �Ű������� �־��� ��, commands�� ��� ���ҿ� ���� �ռ� ������ ������ �������� �� ����
 ����� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 
 array�� ���̴� 1 �̻� 100 �����Դϴ�.
array�� �� ���Ҵ� 1 �̻� 100 �����Դϴ�.
commands�� ���̴� 1 �̻� 50 �����Դϴ�.
commands�� �� ���Ҵ� ���̰� 3�Դϴ�.

����� ��
array						commands							return
[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
����� �� ����
[1, 5, 2, 6, 3, 7, 4]�� 2��°���� 5��°���� �ڸ� �� �����մϴ�. [2, 3, 5, 6]�� �� ��° ���ڴ� 5�Դϴ�.
[1, 5, 2, 6, 3, 7, 4]�� 4��°���� 4��°���� �ڸ� �� �����մϴ�. [6]�� ù ��° ���ڴ� 6�Դϴ�.
[1, 5, 2, 6, 3, 7, 4]�� 1��°���� 7��°���� �ڸ��ϴ�. [1, 2, 3, 4, 5, 6, 7]�� �� ��° ���ڴ� 3�Դϴ�.

 */
import java.util.*;
public class numberk1_1 {
	
	
	    public static int[] solution(int[] array, int[][] commands) {
	        
	        int[] answer = new int[commands.length];
	        int[] arr = new int[3];
	        ArrayList<Integer> temp = new ArrayList<>();
	        
	        for(int i=0; i<commands.length; i++)		// 2���� �迭 0, 1, 2 
	        {
	            for(int j=0; j<3;j++)
	            {
	                arr[j] = commands[i][j];
	            }
	            for(int j=arr[0]-1; j<arr[1];j++)		//�迭 ī���� ������ arr[0]-1 ���� ���� 
	            {
	                temp.add(array[j]); 
	            }
	            Collections.sort(temp);
	            answer[i] = temp.get(arr[2]-1);		// ���� ������ �迭 ī���� ������ �� ������ �� 1�������
	            for(int j =0; j<temp.size(); j++)
	            {
	                temp.clear();		//temp �� ����Ʈ�� �����ִ°� �ʱ�ȭ �������
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
