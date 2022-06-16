package book.chap02;

import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수 : ");
        int n = sc.nextInt();

        int[] height = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("height[%d] : ", i);
            height[i] = sc.nextInt();
        }

        System.out.printf("최댓값은 %d 입니다.", maxOf(height));
    }

    private static int maxOf(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }
}
