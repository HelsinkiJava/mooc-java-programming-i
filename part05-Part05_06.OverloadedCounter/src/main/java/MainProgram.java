
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter list = new Counter(10);
        System.out.println(list.value());
        list.increase();
        System.out.println(list.value());
        list.decrease();
        System.out.println(list.value());
        list.increase(5);
        System.out.println(list.value());
        list.increase(-10);
        System.out.println(list.value());
        list.decrease(5);
        System.out.println(list.value());
        list.decrease(-1);
        System.out.println(list.value());
    }
}
