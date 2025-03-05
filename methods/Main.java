package methods;

abstract class Helper {
    abstract void test(String n);
}

class Add extends Helper {
    int sum = 0;

    static void greeting() {
        System.out.println("Hello John! You are a Java Developer");
    }

    @Override
    public void test(String n) {
        System.out.println("The message is " + n);
    }

    public int addition(int a, int b) {
        sum = a + b;
        return sum;
    }
}

public class Main {
    public void printMessage() {
        System.out.println("Hello Kenya!");
    }

    public static void main(String[] args) {
        Main m = new Main();

        m.printMessage(); // this method can only be called with the help of an instance of the Main Class

        Add a = new Add();
        System.out.println(a.addition(10, 20));

        a.test("Java is amazing!");

        Add.greeting();
    }
}
