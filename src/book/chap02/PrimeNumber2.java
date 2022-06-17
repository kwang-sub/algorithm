package book.chap02;
// 1에서 구했던 소수는 모든 수를 검사했다 하지만 짝수는 2의 배수이기 때문에 소수가 안된다. 이를 바탕으로 개선해보자
public class PrimeNumber2 {
    public static void main(String[] args) {
        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2;

        for (int n = 3; n <= 1000; n += 2) {
            int i;
            for (i = 1; i < ptr; i++) {
                counter++;
                if (n % prime[i] == 0) {
                    break;
                }
            }
            if (i == ptr) {
                prime[ptr++] = n;
            }
        }
        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }
        System.out.printf("나눗셈 횟수 : %d", counter);
    }
}
