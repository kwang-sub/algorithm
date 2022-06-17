package book.chap02;

public class PrimeNumber3 {
    public static void main(String[] args) {
        int counter = 0;
        int[] array = new int[500];
        int ptr = 0;

        array[ptr++] = 2;
        array[ptr++] = 3;

        for (int i = 5; i <= 1000; i += 2) {
            boolean flag = false;

            for (int j = 1; array[j] * array[j] <= i; j++) {
                counter += 2;
                if (i % array[j] == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                counter++;
                array[ptr++] = i;
            }
        }

        for (int i = 0; i < ptr; i++) {
            System.out.println(array[i]);
        }

        System.out.println(counter);
    }
}




