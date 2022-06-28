package book.chap05;

/*피보나치 수열
* 피보나치 수열이란 앞의 두 수의 합이 3번째 수와 같은 경우를 말한다.{1,2,5,7}과 같다.
* 종료 조건은 맨 마지막은 무조건 {1, 1, 2}이다.
* */
public class Fibo {
    public static int fibo(int n) {
        if (n < 3) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibo(7));
    }
}
