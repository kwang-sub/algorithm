package book.question.chap04;

import book.chap04.IntStack;

//임의의 객체형 데이터를 쌓을 수 있는 제네릭 스택 클래스 Gstack<E>를 작성하세요
public class Q02 {

    public class Gstack<E> {
        private int max;
        private int ptr;
        private E [] stk;

        public Gstack(int max) {
            this.max = max;
            this.ptr = 0;
            try {
                this.stk = (E[]) new Object[max];
            } catch (OutOfMemoryError e) {
                max = 0;
            }
        }

        public E push(E obj) throws OverflowGstackException {
            if (ptr >= max) {
                throw new OverflowGstackException();
            }
            return stk[ptr++] = obj;
        }

        public E pop() throws EmptyGstackException {
            if (ptr <= 0) {
                throw new EmptyGstackException();
            }
            return stk[--ptr];
        }

        public E peek() throws EmptyGstackException {
            if (ptr <= 0) {
                throw new EmptyGstackException();
            }
            return stk[ptr - 1];
        }

        public int indexOf(E obj) {
            for (int i = ptr - 1; i >= 0; i--) {
                if (stk[i].equals(obj)) {
                    return i;
                }
            }
            return -1;
        }

        public void clear() {
            ptr = 0;
        }

        public int capacity() {
            return max;
        }

        public int size() {
            return ptr;
        }

        public boolean isEmpty() {
            return ptr <= 0;
        }

        public boolean isFull() {
            return ptr >= max;
        }

        public void dump() {
            if (ptr <= 0) {
                System.out.println("스택이 비어있습니다.");
            } else {
                for (int i = 0; i < ptr; i++) {
                    System.out.println("stk[" + i + "] : " + stk[i] + "");
                }
            }
        }
    }

    // 실행할 때 예외：스택이 비어 있음
    public static class EmptyGstackException extends RuntimeException {
        public EmptyGstackException() {
        }
    }

    // 실행할 때 예외：스택이 가득 참
    public static class OverflowGstackException extends RuntimeException {
        public OverflowGstackException() {
        }
    }
}
