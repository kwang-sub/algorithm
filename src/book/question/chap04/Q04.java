package book.question.chap04;

//큐를 구현하는 프로그램을 만들기
public class Q04 {

    public class IntAryQueue {
        private int max;
        private int ptr;
        private int[] que;

        public IntAryQueue(int max) {
            this.max = max;
            this.ptr = 0;
            try {
                this.que = new int[max];
            } catch (OutOfMemoryError e) {
                max = 0;
            }
        }

        public class EmptyException extends RuntimeException {
            public EmptyException() {
            }
        }

        public class overFlowException extends RuntimeException{
            public overFlowException() {
            }
        }
//      데이터 넣기
        public int enque(int x) throws overFlowException {
            if (ptr >= max) {
                throw new overFlowException();
            }
            return que[ptr++] = x;
        }
//      데이터 빼기
        public int deque() throws EmptyException {
            if (ptr <= 0) {
                throw new EmptyException();
            }

            int num = que[0];

            for (int i = 1; i < ptr; i++) {
                que[i - 1] = que[i];
            }

            return num;
        }
//        마지막값 찾기
        public int peek() throws EmptyException{
            if (ptr <= 0) {
                throw new EmptyException();
            }
            return que[ptr - 1];
        }

//        검색해서 인덱스 찾기
        public int indexOf(int key) throws EmptyException {
            if (ptr <= 0) {
                throw new EmptyException();
            }
            for (int i = 0; i < ptr - 1; i++) {
                if (que[i] == key) {
                    return i;
                }
            }
            return -1;
        }

//        큐를 비움
        public void clear() {
            ptr = 0;
        }

//        큐의용량반환
        public int capacity() {
            return max;
        }

//        큐에 쌓여있는 데이터 수를 반환
        public int size() {
            return ptr;
        }

//        큐가 비었는지 확인
        public boolean isEmpty() {
            return ptr <= 0;
        }


//        큐가 가득차있는지 확인
        public boolean isFull() {
            return ptr >= max;
        }

//        큐안에 데이터 프런트에서 리어 순으로 출력
        public void dump() throws EmptyException {
            if (ptr <= 0) {
                throw new EmptyException();
            }
            for (int i = 0; i < ptr; i++) {
                System.out.print(que[i] + " ");
            }
            System.out.println();
        }
    }
}
