package book.question.chap03;

import java.util.Arrays;
import java.util.Scanner;

//Arrays.binarySearch()를 이용하여 이진탐색 후 검색 실패시 삽입 포인트를 출력하는 프로그램을 작성
public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[]x = new int[num];

        System.out.println("오름차순으로 입력하세요");

        System.out.print("x[0] : ");
        x[0] = sc.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.printf("x[%d] : ", i);
                x[i] = sc.nextInt();
            } while (x[i - 1] > x[i]);
        }

        System.out.print("검색할 값 : ");
        int key = sc.nextInt();

        int idx = Arrays.binarySearch(x, key);

        if (idx < 0) {
            System.out.println("존재하는 값이 없습니다.");
            System.out.printf("삽입 포인트는 %d  ", -(idx + 1));
        } else {
            System.out.printf("%d는 x[%d]에 있습니다.", key, idx);
        }
    }
}
