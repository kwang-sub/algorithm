package book.question.chap04;

//임의이 객체형 데이터를 쌓아 놓을 수 있는 제네릭 큐 클래스 Gqueue<E>를 작성하세요
public class Q06<E> {
    private int max;
    private int num;
    private int front;
    private int rear;
    private E[] que;

    public Q06(int capacity) {
        max = capacity;
        front = rear = num = 0;
        try {
            que = (E[]) new Object[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public static class EmptyException extends RuntimeException {
        public EmptyException() {
        }
    }

    public static class OverflowException extends RuntimeException {
        public OverflowException() {
        }
    }

    public E enque(E x) throws OverflowException {
        if (num >= max) {
            throw new OverflowException();
        }
        que[rear++] = x;
        num++;
        if (rear >= max) {
            rear = 0;
        }
        return x;
    }
    public E deque() throws EmptyException {
        if (num <= 0) {
            throw new EmptyException();
        }
        E x = que[front++];
        num--;
        if (front >= max) {
            front = 0;
        }
        return x;
    }

    public E peek() throws EmptyException {
        if (num <= 0) {
            throw new EmptyException();
        }
        return que[front];
    }

    public int indexOf(E x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % max;
            if (que[idx] == x) {
                return idx;
            }
        }
        return -1;
    }

    public int search(E x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % max;
            if (que[idx] == x) {
                return i + 1;
            }
        }
        return -1;
    }
    public void clear() {
        front = rear = num = 0;
    }
    public int capacity() {
        return max;
    }
    public int size() {
        return num;
    }
    public boolean isEmpty() {
        return num <= 0;
    }
    public boolean isFull() {
        return num >= max;
    }
    public void dump() throws EmptyException {
        if (num <= 0) {
            throw new EmptyException();
        }
        for (int i = 0; i < num; i++) {
            int idx = (front + i) % max;
            System.out.printf("%2s", que[idx]);
        }
        System.out.println();
    }

}


