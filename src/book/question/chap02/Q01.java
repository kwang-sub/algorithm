package book.question.chap02;

import java.util.Arrays;

public class Q01 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
//        maxOf();
//        reverse();
        System.out.printf("배열 a 합계 : %d", sumOf(a));

    }
//    키와 사람수를 난수를 이용해서 받아 최댓값을 구하는 프로그램 작성하세요.
    static void maxOf() {
        int num = (int)(Math.random() * 10) + 1;
        int[] height = new int[num];

        int max = 0;
        for(int i = 0; i < num; i++) {
            height[i] = (int)(Math.random() * 100) + 100;
            if (height[i] > max) {
                max = height[i];
            }
            System.out.printf("height[%d] = %d\n", i, height[i]);
        }
        System.out.printf("최댓값은 %d입니다.", max);
    }

//    배열을 역순으로 정렬하고 그 과정을 나타내는 프로그램을 작성하세요
    static void reverse() {
        int n = (int)(Math.random() * 10) + 1;
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * 20) - 10;
            System.out.printf("a[%d] = %d\n", i, a[i]);
        }
        realReverse(a);

    }

    static void realReverse(int[] a) {
        System.out.println("역순 진행");
        int x = 0;
        for (int i = 0; i < a.length / 2; i++) {
            System.out.println(Arrays.toString(a));
            x = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = x;
            System.out.printf("a[%d]와 a[%d]를 교환합니다.\n", i, a.length - i - 1);
        }
        System.out.println("역순 정렬을 마쳤습니다.");
        System.out.println(Arrays.toString(a));
    }

//    배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하세요
    static int sumOf(int[] a) {
        int sum = 0;
        for (int n : a) {
            sum += n;
        }
        return sum;
    }
}
