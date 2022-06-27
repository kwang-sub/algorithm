package book.question.chap05;

import java.util.Scanner;

//재귀 메서드를 사용하지 않고 팩토리얼 구현하세요
public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("값을 입력하세요 : ");
        int x = sc.nextInt();
        System.out.printf("%d = %d", x, factorial(x));
    }

    private static int factorial(int x) {
        int result = x;
        for (int i = 1; i < x; i++) {
            result = result * i;
        }
        return result;
    }
}
