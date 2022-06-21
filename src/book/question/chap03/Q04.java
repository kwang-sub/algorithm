package book.question.chap03;

import java.util.Scanner;

//요솟수가 n인 배열 a에서 key와 일치하는 인덱스를 배열 idx에 저장하고 일치하는 인덱스가 몇개 있는지 반환하는 메서드 작성하세요
public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] a = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.printf("a[%d] : ", i);
            a[i] = sc.nextInt();
        }

        System.out.print("찾을 값 : ");
        int key = sc.nextInt();

        int[] idx = new int[num];

        int result = searchIdx(a, num, key, idx);
        System.out.printf("\n반환 받은 값 : %d", result);
    }

    private static int searchIdx(int[] a, int num, int key, int[] idx) {
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (a[i] == key) {
                idx[count++] = i + 1;
            }
        }
        for (int n : idx) {
            if (n == 0) {
                break;
            }
            System.out.printf("%2d", n - 1);
        }
        return count;
    }
}
