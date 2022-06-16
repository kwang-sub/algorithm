package book.question.chap01;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("수를 입력하세요");
        int n = sc.nextInt();

//        triangleLB(n);
//        triangleLU(n);
//        triangleRB(n);
//        triangleRU(n);
//        spira(n);
        npira(n);
    }

//   왼쪽아래가 직각인 이등변삼각형 출력
    static void triangleLB(int n) {
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//   왼쪽위가 직각인 이등변삼각형 출력
    static void triangleLU(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//   오른쪽아래가 직각인 이등변삼각형 출력
    static void triangleRB(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j >= 0; j--) {
                if (j > i) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
//   오른쪽위가 직각인 이등변삼각형 출력
    static void triangleRU(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
//    n단의 피라미드 출력하세요
    static void spira(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n/2; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 +1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //    n단의 피라미드 출력하세요 단 숫자를 표시할때는 i % 10으로 표현할 것(숫자버전)
    static void npira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n/2; j >= i - 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i - 1) * 2 +1; j++) {
                System.out.print(i % 10);
            }
            System.out.println();
        }
    }
}
