package book.chap01;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n의 값 : ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;
        while (i <= n){
            sum += i;
            i++;
        }
        System.out.printf("1부터 n까지의 합 : %d", sum);
    }
}