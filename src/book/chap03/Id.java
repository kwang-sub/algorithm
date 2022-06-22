package book.chap03;

public class Id {
    private static int counter = 0;
    private int id;

    public Id() {
        this.id = ++counter;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public static class IdTester {
        public static void main(String[] args) {
            Id a = new Id();
            Id b = new Id();

            System.out.printf("a의 아이디 : %d\n", a.getId());
            System.out.printf("b의 아이디 : %d\n", b.getId());

            System.out.printf("부여한 아이디의 개수 : %d\n", Id.getCounter());
        }
    }
}
