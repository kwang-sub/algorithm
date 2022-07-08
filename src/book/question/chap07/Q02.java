package book.question.chap07;

import java.util.Scanner;

// 버블정렬을 이용하고 정렬과정을 출력하세요
public class Q02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = sc.nextInt();
        }



        sortBubble(arr, num);



    }

    static void sortBubble(int[] arr, int num) {
        int change = 0;
        int count = 0;

        for (int i = 0; i < num - 1; i++) {
            System.out.printf("패스%d: \n", i + 1);
            for (int j = num - 1; j > i; j--) {
                for (int z = 0; z < num; z++) {
                    if (j == z && arr[j] < arr[j - 1]) {
                        System.out.printf(" +%2d", arr[z]);
                    } else if (j == z && arr[j] > arr[j - 1]) {
                        System.out.printf(" -%2d", arr[z]);
                    } else {
                        System.out.printf("%4d", arr[z]);
                    }
                }
                System.out.println();
                count++;
                if (arr[j] < arr[j - 1]) {
                    change(arr, j, j - 1);
                    change++;
                }
            }
        }
        System.out.printf("비교를 %d\n", count);
        System.out.printf("교환을 %d", change);
    }

    static void change(int[] arr, int idx1, int idx2) {
        int n = idx1;
        arr[idx1] = arr[idx2];
        arr[idx2] = n;
    }
}
