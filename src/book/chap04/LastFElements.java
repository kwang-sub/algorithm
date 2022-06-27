package book.chap04;

import java.util.Scanner;

//인큐시 오래된데이터 지우고 인큐하는 링버퍼
public class LastFElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = 10;
        int[] a = new int[N];
        int cnt = 0;
        int retry;

        System.out.println("정수를 입력하세요");

        do {
            System.out.printf("%d번쨰 정수 : ", cnt + 1);
            a[cnt++ % N] = sc.nextInt();

            System.out.print("계속할까요? (1.예/0.아니오) : ");
            retry = sc.nextInt();
        } while (retry == 1);

        int i = cnt - N;
        if (i < 0) {
            i = 0;
        }

        for (; i < cnt; i++) {
            System.out.printf("%2d번째의 정수 = %d\n", i + 1, a[i % N]);
        }
    }
}
