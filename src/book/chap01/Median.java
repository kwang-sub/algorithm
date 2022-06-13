package book.chap01;

import java.util.Scanner;

public class Median {
    static int med3(int a, int b, int c) {
        if (a >= b){
            if (b >= c){
                return b;
            } else if (a <= c) {
                return a;
            } else {
                return c;
            }
        } else if (a > c) {
            return a;
        } else if (b > c) {
            return c;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.printf("3, 2, 1 = %d\n", med3(3, 2, 1));
        System.out.printf("1, 2, 1 = %d\n", med3(1, 2, 1));
        System.out.printf("3, 2, 7 = %d\n", med3(3, 2, 7));

    }
}
