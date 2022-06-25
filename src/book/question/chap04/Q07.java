package book.question.chap04;
//덱 구현 양방향 Que라고 생각하면된다.
public class Q07 {
    int max;
    int rear;
    int front;
    int num;
    int[] que;

    public Q07(int capacity) {
        max = capacity;
        rear = front = rear = 0;
        que = new int[max];
    }

    public enum FrontOrRear{
        FRONT, REAR
    }

    public class EmptyException extends RuntimeException {
        public EmptyException() {
        }
    }

    public class OverFlowException extends RuntimeException {
        public OverFlowException() {
        }
    }

    public int enque(FrontOrRear or, int x) throws OverFlowException {
        if (num >= max) {
            throw new OverFlowException();
        }
        num++;
        if (or.equals(FrontOrRear.FRONT)) {
            if (--front < 0) {
                front = max - 1;
                que[front] = x;
            }
        } else {
            que[rear++] = x;
            if (rear >= max) {
                rear = 0;
            }
        }
        return x;
    }

    public int deque(FrontOrRear or) throws EmptyException {
        if (num <= 0) {
            throw new EmptyException();
        }
        int x;
        num--;
        if (or.equals(FrontOrRear.FRONT)){
            x = que[front++];
            if (front >= max) {
                front = 0;
            }
        } else {
            if (--rear < 0) {
                rear = max - 1;
            }
            x = que[rear];
        }
        return x;
    }

    public int peek(FrontOrRear or) throws EmptyException {
        if (num <= 0) {
            throw new EmptyException();
        }

        if (or.equals(FrontOrRear.FRONT)) {
            return que[front];
        } else {
            int x = rear - 1;
            if (x <= 0) {
                x = max -1;
            }
            return que[x];
        }
    }
    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (front + i) % max;
            if (que[idx] == x) {
                return idx;
            }
        }
        return -1;
    }
    public int search(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (front + i) % max;
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
    public void dump() {
        if (num <= 0) {
            System.out.println("비어있습니다.");
        } else {
            for (int i = 0; i < num; i++) {
                int idx = (front + i) % max;
                System.out.printf("%2d", que[idx]);
            }
            System.out.println();
        }
    }
}
