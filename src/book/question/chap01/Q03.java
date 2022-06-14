package book.question.chap01;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
//        whileTest();
//        forTest();
//        gauss();
//        System.out.printf("3 ~ 5 까지 합 : %d", sumOf(5, 3));
//        minus();
        count();
    }



//while문으로 i값이 1증가할때마다 값을 출력하고 최종값 출력
    static void whileTest() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n의 값 : ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;
        while (i <= n){
            sum += i;
            System.out.printf("현재 i의 값은 %d입니다\n", i);
            i++;
        }
        System.out.printf("1부터 n까지의 합 : %d", sum);
    }

//    n이 7이면 '1 + 2 + 3 + 4 + 5 + 6 + 7  = 28'로 출력하는  for문 만들기
    static void forTest() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n의 값 : ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
            if(i < n){
                System.out.printf("%d + ", i);
            } else {
                System.out.printf("%d = %d", n, sum);
            }
        }
    }

//    1부터 10까지의 합은 (1 + 10) * 5와 같은 방법으로 구할 수 있습니다. 가우스 덧셈이라는 방법을 이용하여 1부터 n까지의 정수 합을 구하는 프로그램 작성
    static void gauss() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n의 값 : ");
        int n = sc.nextInt();
        int sum = (1 + n) * (n / 2) + (n % 2 != 0 ? (n + 1) / 2 : 0);

        System.out.printf("1부터 n까지의 합은 : %d", sum );
    }

//    정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드 작성하세요
    static int sumOf(int a, int b) {
        int result = 0;

        if (a > b) {
            int c = a;
            a = b;
            b = c;
        }

        while (a <= b) {
            result += a;
            a++;
        }

        return result;
    }

//a,b를 입력 받아 b-a를 출력하는 프로그램 작성하세요
    static void minus() {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        
        System.out.println("b - a 입니다");
        while (true) {
            System.out.println("a를 입력하세요");
            a = sc.nextInt();

            System.out.println("b를 입력하세요");
            b = sc.nextInt();

            if (a < b) break;
            else System.out.println("b가 a보다 더 큰 수 이여야 합니다.");
        }
        System.out.printf("%d - %d = %d입니다.", b, a, b-a);
    }

//  양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요
    static void count() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int count = 0;

        while (true) {
            System.out.println("양수를 입력하세요");
            n = sc.nextInt();
            if (n > 0) break;
        }

        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.printf("그 수는 %d자리입니다", count);
    }
}
