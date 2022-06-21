package book.chap03;

import java.util.Scanner;

public class BinSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요");
        System.out.print("x[0] : ");
        x[0] = sc.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.printf("x[%d] : ", i);
                x[i] = sc.nextInt();
            } while (x[i] <= x[i - 1]);
        }
        System.out.print("검색할 값 : ");
        int key = sc.nextInt();

        int idx = binSearch(x, num, key);
        if (idx >= 0) {
            System.out.printf("원하는 값 %d는 x[%d]에 있습니다.", key, idx);
        } else {
            System.out.println("검색하시는 값이 없습니다.");
        }
    }


    static int binSearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;

        do {
            int pc = (pl + pr) / 2;
            if (a[pc] == key) {
                return pc;
            } else if (a[pc] < key) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        } while (pl <= pr);
        return -1;
    }
}
