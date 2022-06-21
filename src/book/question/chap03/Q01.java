package book.question.chap03;

import java.util.Scanner;
//이진탐색을 이용하여 값찾기 for문 이용
public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        System.out.print("x[0] : " );
        x[0] = sc.nextInt();
        for (int i = 1; i < num; i++) {
            do {
                System.out.printf("x[%d] : " , i);
                x[i] = sc.nextInt();
            } while (x[i - 1] > x[i]);
        }

        System.out.print("찾는 키값 : ");
        int key = sc.nextInt();

        int idx = seqSearchSen(x, num, key);
        System.out.printf("%d는 x[%d]", key, idx);
    }

    private static int seqSearchSen(int[] x, int num, int key) {
        int pr = num - 1;
        for (int pl = 0; pl < pr; ) {
            int pc = (pl + pr) / 2;
            if (x[pc] == key) {
                return pc;
            } else if (x[pc] < key) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        }
        return -1;
    }
}
