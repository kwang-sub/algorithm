package book.question.chap03;

import java.util.Scanner;

//이진탐색을 할 경우 같은 값이 있을때 맨앞에 인덱스를 검색하는 프로그램을 만드세요
public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요");
        System.out.print("x[0] : ");
        x[0] = sc.nextInt();
        for (int i = 1; i < num; i++) {
            do {
                System.out.printf("x[%d] : ", i);
                x[i] = sc.nextInt();
            } while (x[i - 1] > x[i]);
        }

        System.out.print("찾을 값 : ");
        int key = sc.nextInt();

        int result = binSearch(x, num, key);
        if (result == -1) {
            System.out.println("해당하는 값이 없습니다.");
        } else {
            System.out.printf("%d는 x[%d]에 있습니다.", key, result);
        }
    }

    private static int binSearch(int[] x, int num, int key) {
         int pr = num - 1;
         for (int pl = 0; pl <= pr;) {
             int pc = (pl + pr) / 2;

             if (x[pc] == key) {
                while (true) {
                    if (pc != 0 && x[pc] == x[pc - 1]){
                        pc -= 1;
                    } else {
                        break;
                    }
                }
                return pc;
             } else if (x[pc] > key) {
                 pr = pc - 1;
             } else {
                 pl = pc + 1;
             }
         }

        return -1;
    }
}
