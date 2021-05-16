package chap7;

import java.util.*;

public class SearchItem7_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // N(������ ��ǰ ����)
        int n = sc.nextInt();
        int[] arr = new int[1000001];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[x] = 1;
        }

        // M(�մ��� Ȯ�� ��û�� ��ǰ ����)
        int m = sc.nextInt();
        int[] targets = new int[n];
        for (int i = 0; i < m; i++) {
            targets[i] = sc.nextInt();
        }

        // �մ��� Ȯ�� ��û�� ��ǰ ��ȣ�� �ϳ��� Ȯ��
        for (int i = 0; i < m; i++) {
            // �ش� ��ǰ�� �����ϴ��� Ȯ��
            if (arr[targets[i]] == 1) {
                System.out.print("yes ");
            }
            else {
                System.out.print("no ");
            }
        }
    }

}