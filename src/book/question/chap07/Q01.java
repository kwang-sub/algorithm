package book.question.chap07;

import java.util.Scanner;

//버블정렬 작은인덱스에서 큰인덱스순으로 정렬
public class Q01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.printf(" arr[%d] = ", i);
            arr[i] = sc.nextInt();
        }

        sortBubble(arr, num);

        for (int i = 0; i < num; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }


    static void sortBubble(int[] arr, int num) {
        int count = num;
        for (int i = num - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] >  arr[j + 1]) {
                    change(arr, j, j + 1);
                }
            }
        }
    }

    static void change(int[] arr, int idx1, int idx2) {
        int n = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = n;
    }
}
