package book.question.chap04;

import book.chap04.IntStack;

import java.util.Scanner;

//IntStack의 모든 메서드를 사용하는 프로그램을 작성하세요,indexOf,clear,max,size,capacity,isEmpty,ispull
public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStack s = new IntStack(64);

        while (true) {
            System.out.printf("현재 데이터수 : %d / %d\n", s.size(), s.capacity());
//indexOf,clear,size,capacity,isEmpty,isFull
            System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (5)indexOf(6)clear" +
                    "\n(7)size(8)capacity(9)isEmpty(10)isFull (0)종료 : ");
            int menu = sc.nextInt();

            int x;

            switch (menu) {
                case 0: break;
                case 1:
                    System.out.print("데이터 : ");
                    x = sc.nextInt();
                    try {
                        s.push(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2:
                    try {
                        x = s.pop();
                        System.out.printf("팝한 데이터는 %d입니다\n", x);
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 3:
                    try {
                        x = s.peek();
                        System.out.printf("피크한 데이터는 %d입니다.\n", x);
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 4:
                    s.dump();
                    break;
                case 5:
                    System.out.print("찾을 값을 입력하세요 : ");
                    int key = sc.nextInt();
                    s.indexOf(key);
                    break;

                case 6:
                    s.clear();
                    System.out.println("스택을 비웁니다.");
                    break;

                case 7:
                    System.out.printf("스택의 현재 쌓여있는 데이터는 : %d\n", s.size());
                    break;

                case 8:
                    System.out.printf("스택의 용량은 : %d\n", s.capacity());
                    break;

                case 9:
                    if (s.isEmpty()) {
                        System.out.println("현재 비어있습니다.");
                    } else {
                        System.out.println("비어 있지 않습니다.");
                    }
                    break;

                case 10:
                    if (s.isFull()) {
                        System.out.println("현재 가득 차있습니다.");
                    } else {
                        System.out.println("여유공간이 있습니다.");
                    }
                    break;
            }
        }
    }
}
