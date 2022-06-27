package book.question.chap05;

import java.util.Scanner;

//재귀메서드를 사용하지 않고 유클리드 호제법으로 최대공약수 구하세요
public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("값 1 : ");
        int a = sc.nextInt();
        System.out.print("값 2 : ");
        int b = sc.nextInt();

        System.out.printf("%d", gcd(a, b));
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

//    내가 푼 방식.... 정답보고 다시 작성하기
/*    private static int gcd(int a, int b) {
        int result = 0;
        while (true){
            if (a > b) {
                if (a % b == 0) {
                    result = b;
                    break;
                } else {
                    a = a % b;
                }
            } else {
                if (b % a == 0) {
                    result = a;
                    break;
                } else {
                    b = b % a;
                }
            }
        }
        return result;
    }*/

}
