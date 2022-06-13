package book.question.chap01;

public class Q01 {
    public static void main(String[] args) {
        System.out.printf("max4(2, 3, 1, 5) = %d\n", max4(2, 3, 1, 5));
        System.out.printf("min3(2, 3, 1) = %d\n", min3(2, 3,1));
        System.out.printf("min4(2, 3, 1, 5) = %d\n", min4(2, 3, 1, 5));
    }

//    네 값의 최댓값을 구하는 max4 메서드를 작성하세요.
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (max < b)  max = b;
        if (max < c)  max = c;
        if (max < d)  max = d;

        return max;
    }

//    세 값의 최솟값을 구하는 min3 메서드를 작성하세요
    static int min3(int a, int b, int c) {
        int min = a;
        if (min > b)  min = b;
        if (min > c)  min = c;

        return min;
    }

//    네값의 최솟 값을 구하는 min4 메서드를 작성하세요
    static int min4(int a, int b, int c, int d) {
        int min = a;
        if (min > b)  min = b;
        if (min > c)  min = c;
        if (min > d)  min = d;

        return min;
    }

}
