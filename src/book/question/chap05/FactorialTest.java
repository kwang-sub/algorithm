package book.question.chap05;

//팩터리얼 꼬리 재귀 최적화 테스트
public class FactorialTest {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
    static long factorial(int n) {
        return realFactorial(n, 1);
    }
    static long realFactorial(long n, long sum) {
        if (n == 1) {
            return sum * 1;
        }
        return realFactorial(n -1, n * sum);
    }
}
