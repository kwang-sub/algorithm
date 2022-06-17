package book.question.chap02;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
//    기존 dayOfYear를 변수 i와 days없이 while문으로 구현하세요

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;

        System.out.println("그 해 경과 일수를 구합니다.");

        do {
            System.out.print("년 : ");
            int year = sc.nextInt();
            System.out.print("월 : ");
            int month = sc.nextInt();
            System.out.print("일 : ");
            int day = sc.nextInt();

            System.out.printf("경과일수는 %d입니다.\n", dayOfYear(year, month, day));
            System.out.printf("남은일수는 %d입니다\n", leftDayOfYear(year, month, day));
            System.out.println("다시? 1.다시/2.취소");
            flag = sc.nextInt() == 1 ? true : false;
        } while (flag);

    }

    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }
    };

    //  윤년을 구하는 메서드
    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }
    //  날짜 합산
/*    static int dayOfYear(int y, int m, int d) {
        int days = d;
        for (int i = 1; i < m; i++) {
            days += mdays[isLeap(y)][i - 1];
        }
        return days;
    }*/
//    while문으로 구하기
    static int dayOfYear(int y, int m, int d) {
        while (--m > 0) {
            d += mdays[isLeap(y)][m];
        }
        return d;
    }

//    입력 받은 날짜의 남은 일수를 구하세요.
    static int leftDayOfYear(int y, int m, int d) {
        int days = mdays[isLeap(y)][m - 1] - d;
        while (m < 12) {
            days += mdays[isLeap(y)][m];
            m++;
        }
        return days;
    }
}
