package book.question.chap05;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("하노이의 탑");
        System.out.print("원반 갯수 : ");
        int n = sc.nextInt();
        move(n, 1, 3);
    }
    static void move(int no, int start, int to) {
        if (no == 1) {
            move(1, start, to);
        }
        System.out.printf("%d번 원반을 %d에서 %d로 이동", no, start, to);
    }
}
