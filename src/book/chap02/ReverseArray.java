package book.chap02;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("요솟수 :");
        int num = sc.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < x.length; i++) {
            System.out.printf("x[%d] = ", i);
            x[i] = sc.nextInt();
        }

        reverse(x);
        System.out.println("역순 출력");

        int count = 0;
        for (int n : x) {
            System.out.printf("x[%d] = %d\n", count++, n);
        }

    }

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }
}
