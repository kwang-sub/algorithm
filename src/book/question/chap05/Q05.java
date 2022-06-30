package book.question.chap05;

import book.chap04.IntStack;

import java.util.Scanner;

//recur3를 비재귀적으로 구현
public class Q05 {

    static void recur3(int n) {
        int[] nstk = new int[100];
        int[] sstk = new int[100];
        int ptr = -1;
        int step = 0;

        while (true) {
            if (n > 0) {
                ptr++;
                nstk[ptr] = n;
                sstk[ptr] = step;

                if (step == 0) {
                    n = n - 1;
                } else if (step == 1) {
                    n = n - 2;
                }
                continue;
            }

            do {
                n = nstk[ptr];
                step = sstk[ptr] + 1;
                ptr--;

                if (step == 2) {
                    System.out.println(n);

                    if (ptr < 0) {
                        return;
                    }
                }
            } while (step == 2);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요.：");
        int x = stdIn.nextInt();

        recur3(x);
    }
}
