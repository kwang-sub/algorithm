package book.question.chap01;

public class Q02 {
//  세 값의 대소 관계 13종류의 모든조합에 대해 중앙값을 구하여 축력하는 프로그램을 작성하세요
    public static void main(String[] args) {
        System.out.printf("3, 2, 1 = %d\n", med3(3, 2, 1));
        System.out.printf("3, 2, 2 = %d\n", med3(3, 2, 2));
        System.out.printf("3, 1, 2 = %d\n", med3(3, 1, 2));
        System.out.printf("3, 3, 2 = %d\n", med3(3, 3, 2));

        System.out.printf("1, 3, 2 = %d\n", med3(1, 3, 2));
        System.out.printf("2, 3, 2 = %d\n", med3(2, 3, 2));
        System.out.printf("2, 3, 1 = %d\n", med3(2, 3, 1));
        System.out.printf("3, 3, 1 = %d\n", med3(3, 3, 1));

        System.out.printf("2, 2, 3 = %d\n", med3(2, 2, 3));
        System.out.printf("1, 2, 3 = %d\n", med3(1, 2, 3));
        System.out.printf("2, 1, 3 = %d\n", med3(2, 1, 3));
        System.out.printf("2, 3, 3 = %d\n", med3(2, 3, 3));

        System.out.printf("3, 3, 3 = %d\n", med3(3, 3, 3));
    }

//    아래와 같이 중앙값을 구할 수 있는데 med3의 비해 효율이 떨어지는 이유 설명하세요
    /*  아래와 같은 방법에서 첫 번째 if문 확인 시 b >= a에서 b와 a의 대소관계를 판단하는데 false일 경우 다음 b <= a에서도 대소관계를 판단하므로
    비용이 비교적 많이 든다라는 단점이 있다.*/
    static int newMed3(int a, int b, int c) {
        if ((b >= a && c <= a) || (b <= a && c >= a)){
            return a;
        } else if ((a > b && c < b) || (a < b && c > b)) {
            return b;
        }
        return c;
    }

    static int med3(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {
                return b;
            } else if (a <= c) {
                return a;
            }
            return c;
        } else if (a > c) {
            return a;
        } else if (b > c) {
            return c;
        } else {
            return b;
        }
    }


}
