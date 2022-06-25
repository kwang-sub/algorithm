package book.question.chap04;
//IntQueue에 임의의 데이터를 검색하는 메서드 추가하고 프런트로부터 몇번째 인덱스인지 반환 프런트이면 1을 반환
public class Q05 {
    public static class IntQueue {
        int rear, num, front, max;
        int que[];

        public IntQueue(int max) {
            this.max = max;
            rear = num = front = 0;
            que = new int[max];
        }

        public class OverFlowException extends RuntimeException {
            public OverFlowException() {
            }
        }

        public class EmptyException extends RuntimeException {
            public EmptyException() {
            }
        }

        public int enque(int x) throws OverFlowException {
            if (num >= max) {
                throw new OverFlowException();
            }
            que[rear++] = x;
            num++;
            if (rear >= max) {
                rear = 0;
            }
            return x;
        }

        public int deque() throws EmptyException {
            if (num <= 0) {
                throw new EmptyException();
            }

            int x = que[front++];
            num--;
            if (front >= max) {
                front = 0;
            }
            return x;
        }

        public int search(int x) throws EmptyException {
            if (num <= 0) {
                throw new EmptyException();
            }
            for (int i = 0; i < max; i++) {
                int idx = (i + front) % max;
                if (que[idx] == x) {
                    return i + 1;
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        IntQueue que = new IntQueue(10);
        que.enque(5);
        que.enque(3);
        que.enque(2);
        System.out.printf("search 5 : 큐에 %d번째에 있습니다.", que.search(5));

    }
}
