package book.chap03;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] x = {
                "abstract", "assert", "boolean", "break", "byte",
                "case", "catch", "char", "class", "const"
        };

        System.out.println("원하는 키워드를 입력하세요");
        String key = sc.next();

        int idx = Arrays.binarySearch(x, key);
        if (idx < 0) {
            System.out.println("해당 값이 없습니다.");
        } else {
            System.out.printf("해다 키워드는 x[%d]에 있습니다.", idx);
        }
    }
}
