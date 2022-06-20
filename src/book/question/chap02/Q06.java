package book.question.chap02;

import java.util.Arrays;

public class Q06 {
//    서기 년월일을 필드로 갖는 클래스를 만들고 n일뒤의 날짜를 반환, n일 앞의 날짜를 반환하는 프로그램을 작성하세요

    static class YMD {
        int y;
        int m;
        int d;

        int[][] mdays = {
                {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
                {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }
        };

        int isLeap(int year) {
            return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
        }

        public YMD(int y, int m, int d) {
            this.y = y;
            this.m = m;
            this.d = d;
        }

        @Override
        public String toString() {
            return "YMD{" +
                    "y=" + y +
                    ", m=" + m +
                    ", d=" + d +
                    '}';
        }

        //앞의 날짜 반환
        public void before(int n) {
            YMD before = new YMD(this.y, this.m, this.d);
            before.d -= n;
            while (before.d < 1) {
                before.d += mdays[isLeap(before.y)][--before.m];
                if (before.m == 0) {
                    before.m = 12;
                    before.y -= 1;
                }
            }

            System.out.printf("일 전은 %d-%d-%d입니다.\n",  before.y, before.m, before.d);
        }
//뒤의 날짜 반환
        public void after(int n) {
            YMD after = new YMD(this.y, this.m, this.d);
            after.d += n;
            after.m = after.m - 1;
            while (after.d > mdays[isLeap(after.y)][after.m]) {
                after.d -= mdays[isLeap(after.y)][after.m++];
                if (after.m == 12) {
                    after.y += 1;
                    after.m = 0;
                }
            }
            System.out.printf("%d-%d-%d", after.y, after.m + 1, after.d);

        }
    }

    public static void main(String[] args) {
        YMD a = new YMD(2022, 12, 31);
        a.before(365);
        a.after(366);
    }
}
