package book.question.chap03;

import java.util.Scanner;

//선형검색을 하되 스캔되는 과정을 출력하는 프로그램 작성
public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.printf("x[%d] : ", i);
            x[i] = sc.nextInt();
        }
        System.out.print("찾는 값 : ");
        int key = sc.nextInt();

        int idx = searchDetail(x, num, key);
        if (idx == -1) {
            System.out.println("일치하는 값이 없습니다.");
        } else {
            System.out.printf("%d는 x[%d]에 있습니다.", key, idx);
        }
    }

    private static int searchDetail(int[] x, int num, int key) {
        System.out.print("   | ");
        for (int n : x) {
            System.out.printf("%2d", n);
        }
        System.out.println("\n---+---------------------");
        for (int i = 0; i < num; i++) {
            System.out.print("   |");
            System.out.printf(String.format("%%%ds*\n", (i * 2) + 2), "");
            System.out.printf("%3d| ", i);
            for (int n : x) {
                System.out.printf("%2d", n);
            }
            System.out.println("\n   |");
            if (x[i] == key) {
                return i;
            }
        }

        return -1;
    }

}
