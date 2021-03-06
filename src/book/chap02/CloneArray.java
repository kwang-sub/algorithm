package book.chap02;

public class CloneArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a.clone();

        b[3] = 0;
        System.out.println("======a=======");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = %d\n", i, a[i]);
        }
        System.out.println("======b=======");
        for (int i = 0; i < b.length; i++) {
            System.out.printf("b[%d] = %d\n", i, b[i]);
        }
    }
}
