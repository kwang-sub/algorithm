package book.chap04;

import java.util.Scanner;

public class IntQueueTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntQueue s = new IntQueue(64);

        while (true) {
            System.out.printf("현재 데이터 수 : %d / %d\n", s.size(), s.capacity());
            System.out.println("(1)인큐 (2)디큐 (3)피크 (4)덤프 (5)종료");
            System.out.print("메뉴를 입력하세요 : ");
            int menu = sc.nextInt();

            if (menu == 0) {
                break;
            }

            int x;

            switch (menu) {
                case 1 :
                    System.out.print("데이터 : ");
                    x = sc.nextInt();
                    try {
                        s.enque(x);
                    } catch (IntQueue.OverflowIntQueueException e) {
                        System.out.println("큐가 가득 찼습니다.");
                    }
                    break;

                case 2 :
                    try {
                        System.out.printf("디큐한 데이터는 %d입니다.\n", s.deque());
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;

                case 3 :
                    try {
                        System.out.printf("피크한 데이터는 %d입니다\n", s.peek());
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어있습니다.");
                    }
                    break;

                case 4 :
                    s.dump();
                    break;
            }
        }
    }
}
