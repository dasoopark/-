package chap7;

import java.util.*;

public class mapItem7_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // N(������ ��ǰ ����)
        int n = sc.nextInt();
        // ����(Set) ������ ó���ϱ� ���� HashSet ���̺귯��
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            s.add(x);
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
            if (s.contains(targets[i])) {
                System.out.print("yes ");
            }
            else {
                System.out.print("no ");
            }
        }
    }
