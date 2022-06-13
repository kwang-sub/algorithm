package book.chap01;

import java.util.Scanner;

public class Max3 {

    static int max3(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        return max;
    }

    public static void main(String[] args) {
        System.out.println("3, 2, 1 = " + max3(3, 2, 1));
        System.out.println("3, 2, 2 = " + max3(3, 2, 2));
        System.out.println("3, 2, 4 = " + max3(3, 2, 4));
    }
}
