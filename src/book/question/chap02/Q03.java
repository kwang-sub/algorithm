package book.question.chap02;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];

        System.out.println("10진수를 기수 변환합니다.");
        do {
            do {
                System.out.println("변환하는 음이 아닌 정수");
                no = sc.nextInt();
            } while (no < 0);
            do {
                System.out.println("어떤 진수로 변환할까요? (2~36)");
                cd = sc.nextInt();
            }while (cd < 2 || cd > 36);

            dno = cardConvDetail(no, cd, cno);
            System.out.printf("%d진수로는", cd);
            for (int i = dno + 1; i < cno.length; i++) {
                System.out.print(cno[i]);
            }
            System.out.print("입니다.");

            System.out.println("한 번 더 할까요? (1.예 / 2.아니오)");
            retry = sc.nextInt();
        } while (retry == 1);
    }


    //    x를 r진수로 만들고 d에 역순으로 저장하는 메서드
    static int cardConv(int x, int r, char[] d) {
        int digits = d.length - 1;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits--] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);
        return digits;
    }
    
//    기수변환과정을 자세히 나타내는 프로그램을 작성하세요
    static int cardConvDetail(int x, int r, char[] d) {
        int digits = d.length - 1;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            System.out.printf("%2d | %7d  %s\n", r, x, digits != d.length - 1 ? "''' " + x % r : "");
            System.out.println("   +-----------");
            d[digits--] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);
        System.out.printf("%12d\n", 0);
        return digits;
    }
}
