package book.question.chap03;

import book.chap03.PhysExamSearch;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q07 {
    static class PhyscData {
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        @Override
        public String toString() {
            return "PhyscData{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", vision=" + vision +
                    '}';
        }

        public static final Comparator<PhyscData> VISION_ORDER = new visionOrderComparator();

        private static class visionOrderComparator implements Comparator<PhyscData> {
            @Override
            public int compare(PhyscData o1, PhyscData o2) {
                return o1.vision < o2.vision ? 1 : o1.vision > o2.vision ? -1 : 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("홍준기", 164, 0.4),
                new PhyscData("유지훈", 168, 0.4),
                new PhyscData("김한결", 170, 0.4),
                new PhyscData("전서현", 178, 0.4),
                new PhyscData("이나령", 162, 0.3),
        };

        System.out.printf("시력이 몇인 사람을 찾나요?");
        double key = sc.nextDouble();
        int idx = Arrays.binarySearch(x, new PhyscData("",0, key), PhyscData.VISION_ORDER);
        System.out.println(idx);
        if (idx < 0) {
            System.out.println("찾는 값이 없습니다.");
        } else {
            System.out.printf("%f는 x[%d]에 있습니다\n", key, idx);
            System.out.println(x[idx]);
        }
    }
}
