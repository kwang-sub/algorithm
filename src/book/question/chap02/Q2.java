package book.question.chap02;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = {1, 2, 3, 4};
//        copy(a, b);
        rcopy(a, b);
    }

//    배열 b의 모든 요소를 배열 a에 복사하는 메서드  copy를 작성하세요
    static void copy(int[] a, int[] b) {
        System.out.println("복사전");
        System.out.printf("a = %s\n", Arrays.toString(a));
        System.out.printf("b = %s\n", Arrays.toString(b));
        
        int x = a.length >= b.length ? b.length  : a.length;
        for (int i = 0; i < x; i++) {
            a[i] = b[i];
        }
        System.out.println("복사완료");
        System.out.printf("a = %s\n", Arrays.toString(a));
        System.out.printf("b = %s\n", Arrays.toString(b));
    }
//    배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드 rcopy를 작성하세요
    static void rcopy(int[] a, int[] b) {
        System.out.println("복사전");
        System.out.printf("a = %s\n", Arrays.toString(a));
        System.out.printf("b = %s\n", Arrays.toString(b));

        int x = a.length >= b.length ? b.length  : a.length;
        for (int i = 0; i < x; i++) {
            a[i] = b[b.length - i - 1];
        }
        System.out.println("복사완료");
        System.out.printf("a = %s\n", Arrays.toString(a));
        System.out.printf("b = %s\n", Arrays.toString(b));
    }
}
