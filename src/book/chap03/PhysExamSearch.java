package book.chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {

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
        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData> {
            @Override
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.height > d2.height) ? 1 :
                        (d1.height < d2.height) ? -1 : 0;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("이나령", 162, 0.3),
                new PhyscData("홍준기", 164, 0.4),
                new PhyscData("유지훈", 168, 0.4),
                new PhyscData("김한결", 170, 0.4),
                new PhyscData("전서현", 178, 0.4),
        };

        System.out.print("몇 cm인 사람을 찾고 있나요? ");
        int height = sc.nextInt();
        int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER);

        if (idx < 0) {
            System.out.println("요소가 없습니다.");
        } else {
            System.out.printf("x[%d]에 있습니다.\n", idx);
            System.out.printf("찾은 데이터 : %s\n", x[idx]);
        }
    }
}
