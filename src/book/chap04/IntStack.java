package book.chap04;

public class IntStack {
    private int max; //스택용량
    private int ptr; //스택 포인터 : 현재 쌓일 데이터의 위치를 나타낸다. 즉 ptr - 1이 실제 스택에 데이터가 쌓인 마지막 인덱스
    private int[] stk; //실제 스택

//    스택 접근시 비어있을 경우 던질 예외
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {}
    }

//    스택 접근이 가득 차있을 경우 던질 예외
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {}
    }

    public IntStack(int max) {
        this.ptr = 0;
        this.max = max;
        try {
            this.stk = new int[max];
        } catch (OutOfMemoryError e) { // 힙 메모리 공간이 부족하여 배열이 생성된지 못할 경우를 대비
            max = 0;
        }
    }

    public int push(int x) throws OverflowIntStackException {
// 문제 없이 스택이 쌓일 경우 ptr이 max가 되는 순가 꽉찬거임을 확인할 수 있지만 비정상적인 작동으로 초과하는 일도 생길수 있기 때문에 안정성을 위해 >= 사용
        if (ptr >= max) {
            throw new OverflowIntStackException(); // 데이터가 가득 찼는지 확인하고 예외를 던짐
        }
        return stk[ptr++] = x;
    }

    public int pop() throws EmptyIntStackException {
        if (ptr <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[--ptr];
    }

//    스택에 쌓여있는 데이터중 마지막 값 확인
    public int peek() throws EmptyIntStackException {
        if (ptr <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[ptr - 1];
    }

//    스택에서 원하는 값을 찾기(마지막 인덱스부터 검사 중복 값중 먼저 pop되는 데이터를 찾기 위해서이다)
    public int indexOf(int x) {
        for (int i = ptr; i >= 0; i--) {
            if (stk[i] == x) {
                return i; //검색성공시 인덱스 리턴
            }
        }
        return -1; //검색실패시 -1 리턴
    }

//    스택을 비움
    public void clear() {
        ptr = 0;
    }

//    스택의 용량 확인
    public int capacity() {
        return max;
    }

//    스택에 쌓여있는 데이터 수를 반환
    public int size() {
        return ptr;
    }

//    스택이 비어있는지 확인
    public boolean isEmpty() {
        return ptr <= 0;
    }

//    스택이 가득 찼는지 확인
    public boolean isFull() {
        return ptr >= max;
    }

//     스택안의 모든 데이터를 출력(바닥 -> 꼭대기)
    public void dump() {
        if (ptr <= 0) {
            System.out.println("스택이 비어있습니다.");
        } else {
            for (int i = 0; i < ptr; i++) {
                System.out.printf("stk[%d] : \n", stk[i]);
            }
        }
    }
}
