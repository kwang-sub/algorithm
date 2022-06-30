package book.question.chap05;

import java.util.Scanner;

public class Q06 {

    static char convertChar(int n) {
        return (char) (n + 64);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("하노이의 탑");

        System.out.print("원반 갯수 : ");
        int n = sc.nextInt();

        move(n, 1, 2);
    }

    static void move(int no, int from, int to) {
        realMove(no, from, to, 6 - from - to);
    }

    static void realMove(int target, int from, int to, int mid) {
        if (target == 1) {
            System.out.printf("%s는 %s기둥에서 %s기둥으로 이동 \n", target, convertChar(from), convertChar(to));
        } else {
            realMove(target - 1, from, mid, to);
            System.out.printf("%s는 %s기둥에서 %s기둥로 이동\n", target, convertChar(from), convertChar(to));
            realMove(target - 1, mid, to, from);
        }
    }

}
