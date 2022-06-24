package book.chap04;

public class IntQueue {
    private int max;
    private int front;
    private int rear;
    private int num;
    private int[] que;

    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {}
    }

    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {
        }
    }

    public IntQueue(int capacity) {
        max = capacity;
        num = front = rear = 0;
        try {
            this.que = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }
}
