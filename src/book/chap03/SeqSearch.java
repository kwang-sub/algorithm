package book.chap03;

import java.util.Scanner;

public class SeqSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.printf("x[%d] = ", i);
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값 : ");
        int key = sc.nextInt();

        int idx = seqSearch(x, num, key);

        if (idx == -1) {
            System.out.println("값이 요소의 없습니다.");
        } else {
            System.out.printf("%d은 x[%d]의 있습니다.", key, idx);
        }
    }
    static int seqSearch(int[] a, int n, int key) {
        int i = 0;

        while (true) {
            if (i == n) {
                return -1;
            }
            if (a[i] == key) {
                return i;
            }
            i++;
        }
    }
}
