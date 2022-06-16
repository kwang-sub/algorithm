package book.chap02;

public class IntArray {
    public static void main(String[] args) {
        int[] a = new int[5];

        a[1] = 57;
        a[2] = 61;
        a[4] = a[1] * 2;

        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = %d\n", i, a[i]);
        }
    }
}
