package book.question.chap04;

//하나의 배열을 공유하여 2개의 스택을 구현하는 int형 데이터용 스택 클래스를 만드세요
public class Q03 {
    int ptrA;
    int ptrB;
    int max;
    int[] stk;

    public class OverFlowException extends RuntimeException {
        public OverFlowException() {
        }
    }

    public class EmptyException extends RuntimeException {
        public EmptyException() {
        }
    }

    public enum  AorB {
        A, B
    };

    public Q03(int max) {
        this.ptrA = 0;
        this.ptrB = max - 1;
        this.max = max;
        try {
            this.stk = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public void push(AorB or, int num) throws OverFlowException{
        if (ptrA >= ptrB) {
            throw new OverFlowException();
        }

        if (or.equals(AorB.A)) {
            stk[ptrA++] = num;
        } else {
            stk[ptrB--] = num;
        }
    }

    public int pop(AorB or, int num) throws EmptyException {
        if (ptrA <= 0 || ptrB >= (max - 1)) {
            throw new EmptyException();
        }

        if (or.equals(AorB.A)) {
            return stk[--ptrA];
        } else {
            return stk[++ptrB];
        }
    }

    public int peek(AorB or) throws EmptyException {
        if (ptrA <= 0 || ptrB >= (max - 1)) {
            throw new EmptyException();
        }

        if (or.equals(AorB.A)) {
            return stk[ptrA - 1];
        } else {
            return stk[ptrB + 1];
        }
    }

    public int indexOf(AorB or, int num) {
        if (or.equals(AorB.A)) {
            for (int i = ptrA - 1; i >= 0; i--) {
                if (stk[i] == num) {
                    return i;
                }
            }
        } else {
            for (int i = ptrB + 1; i < max; i++) {
                if (stk[i] == num) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void clear(AorB or) {
        if (or.equals(AorB.A)) {
            ptrA = 0;
        } else {
            ptrB = max - 1;
        }
    }

    public int capacity() {
        return max;
    }

    public int size(AorB or) {
        if (or.equals(AorB.A)) {
            return ptrA - 1;
        } else {
            return max - 1 - ptrB;
        }
    }

    public boolean isEmpty(AorB or) {
        if (or.equals(AorB.A)) {
            return ptrA <= 0;
        } else {
            return ptrB >= max - 1;
        }
    }

    public boolean isFull() {
        return ptrA >= ptrB + 1;
    }

    public void dump(AorB or) {
        if (or.equals(AorB.A)) {
            if (ptrA <= 0) {
                System.out.println("스택이 비었습니다");
            } else {
                for (int i = 0; i < ptrA; i++) {
                    System.out.println(stk[i]);
                }
            }
        } else {
            if (ptrB >= (max - 1)) {
                System.out.println("스택이 비었습니다.");
            } else {
                for (int i = max - 1; i > ptrB; i--) {
                    System.out.println(stk[i]);
                }
            }
        }
    }
}
