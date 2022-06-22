package book.question.chap03;

import java.util.Scanner;

//이진 탐색 과정을 출력하는 트로그램 출력
public class Q04 {
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
            } while (x[i - 1] >= x[i]);
        }

        System.out.print("찾을 값 : ");
        int key = sc.nextInt();

        int result = binSearch(x, num, key);

        System.out.println(result);
    }

    private static int binSearch(int[] x, int num, int key) {
        int pr = num - 1;

        System.out.printf("%3s", "|");
        for (int n : x) {
            System.out.printf("%2d", n);
        }
        System.out.println("\n--+--------------");
//        System.out.printf(String.format("%%%ds*\n", (i * 2) + 2), "");

        for (int pl = 0; pl <= pr;) {
            int pc = (pl + pr) / 2;
            if (pl != pc)
                System.out.printf(String.format("%%%ds<-%%%ds+", (pl * 2) + 2, (pc - pl) * 2), "", "");
            else
                System.out.printf(String.format("%%%ds<-+", pc * 4 + 1), "");
            if (pc != pr)
                System.out.printf(String.format("%%%ds->\n", (pr - pc) * 4 - 2), "");
            else
                System.out.println("->");
            System.out.printf("%2d|", pc);
            for (int n : x) {
                System.out.printf("%2d", n);
            }
            System.out.printf("\n%3s\n", "|");
            if (x[pc] == key) {
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

