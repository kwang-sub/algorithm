package book.chap01;

import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n의 값: ");
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.printf("1부터 %d까지의 합은 %d입니다\n", n, sum);
    }
}
