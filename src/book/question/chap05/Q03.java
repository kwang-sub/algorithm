package book.question.chap05;

import java.util.Arrays;
import java.util.Scanner;

//배열 a의 모든 요소의 최대공약수를 구하는 다음 메서드를 작성하세요
public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.printf("arr[%d] : ", i);
            arr[i] = sc.nextInt();
        }

        int x = gcdArray(arr, 0, num);
        System.out.printf("최대 공약수는 %d ", x);
    }

//    arr = 대상 배열, start = 메서드에서 시작점으로 잡을 배열 위치, no = start가 변화함에 따라 크기도 no으로 조절해서 넘김
    static int gcdArray(int[] arr, int start, int no) {
        if (no == 1) {
            return arr[0];
        } else if (no == 2) {
            return gcd(arr[start], arr[start + 1]);
        } else {
            return gcd(arr[start],gcdArray(arr, start + 1, no - 1));
        }
    }

    static int gcd(int a, int b) {
       while (b != 0) {
           int temp = b;
           b = a % b;
           a = temp;
       }
       return a;
    }
}
