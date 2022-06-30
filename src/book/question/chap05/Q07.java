package book.question.chap05;

import com.sun.org.apache.xml.internal.utils.IntStack;

import java.util.Scanner;
//move를 비재귀적으로 표현
public class Q07 {

    /*static void move(int no, int x, int y) {
        if (no > 1) {
            move(no - 1, x, 6 - x - y);
        }
        System.out.printf("원반%d를 %d기둥에서 %d기둥으로 옮김\n", no, x, y);

        if (no > 1) {
            move(no - 1, 6 - x - y, y);
        }
    }*/

    static void move(int no, int x, int y) {
        boolean flag = true;
        IntStack chek = new IntStack(100);

        while (flag) {
            while (no > 1) {
                chek.push(no);
                no = no - 1;
            }
            if (!chek.empty()) {

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("하노이의 탑");
        System.out.print("원반 갯수 : ");
        int n = sc.nextInt();
        move(n, 1, 3);
    }
}
