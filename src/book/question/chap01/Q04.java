package book.question.chap01;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
//        gugudan();
//        plus();
        square();
    }
/*내가 그린 구구단....모든걸 하나의 반복문 안에서 해결해야된다고 생각했네...해답보면 for문 필요한 부분 따로따로 돌렸음..
그리고 %d사용시 %3d사용하면 공간 확보... 띄어쓰기로 간격 맞출필요 없었음...*/
    static void gugudan() {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.print("  | ");
                    }else {
                        System.out.print(i + " | ");
                    }
                } else if (i == 0) {
                    System.out.print(j + "  ");
                } else {
                    if ( i * j >= 10) {
                        System.out.print(i * j + " ");
                    } else {
                        System.out.print(i * j + "  ");
                    }
                }
            }
            if (i == 0){
                System.out.println();
                for (int z = 0; z <= 9; z++) {
                    if (z == 0) {
                        System.out.print("--+");
                    } else {
                        System.out.print("---");
                    }
                }
            }
            System.out.println();
        }

//정답지에서 제공한 방식
        System.out.print("   |");
        for (int i = 1; i <= 9; i++)
            System.out.printf("%3d", i);
        System.out.println("\n---+---------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= 9; j++)
                System.out.printf("%3d", i * j);
            System.out.println();
        }
    }

//    위에서 했던 구구단과 같은 형식으로 덧셈을 표현하세요
    static void plus() {
        System.out.print("  |");
        for(int i = 1; i < 10; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println("\n--+---------------------------");

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j == 1) {
                    System.out.printf(" %d|%3d", i, i + j);
                }else {
                    System.out.printf("%3d", i + j);
                }
            }
            System.out.println();
        }
    }

//    수를 입력 받고 그 수에 맞는 정사각형을 *로 출력하세요
    static void square() {
        Scanner sc = new Scanner(System.in);
        System.out.println("수를 입력하세요");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0;  j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
