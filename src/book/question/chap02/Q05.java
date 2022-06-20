package book.question.chap02;

import book.chap02.PhysicalExamination;

import java.util.Scanner;

public class Q05 {

    static final int VMAX = 21;

    static class PhyscData {
        String name;
        int height;
        double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    static double aveHeight(Q05.PhyscData[] data) {
        double sum = 0;

        for (int i = 0; i < data.length; i++) {
            sum += data[i].height;
        }
        return sum / data.length;
    }

    static void distVision(Q05.PhyscData[] data, int[] dist) {
        int i = 0;

        dist[i] = 0;
        for (i = 0; i <data.length; i++) {
            if (data[i].vision >= 0.0 && data[i].vision <= VMAX / 10.0) {
                dist[(int)(data[i].vision * 10)]++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q05.PhyscData[] x = {
                new Q05.PhyscData("a", 162, 0.3),
                new Q05.PhyscData("b", 122, 0.4),
                new Q05.PhyscData("c", 145, 0.4),
                new Q05.PhyscData("d", 115, 1.3),
                new Q05.PhyscData("e", 176, 2.3),
                new Q05.PhyscData("f", 186, 1.7),
        };
        int[] vdist = new int[VMAX];

        System.out.println("신체검사 리스트");
        System.out.printf("%s%7s%4s\n", "이름", "키", "시력");
        System.out.println("=========================");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
        }

        System.out.printf("\n평균 키 : %5.1fcm\n", aveHeight(x));
        distVision(x, vdist);
        System.out.println("시력 분포");
        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f~: ", i / 10.0);
            for (int j = 0; j < vdist[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
