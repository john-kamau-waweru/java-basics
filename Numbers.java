public class Numbers {
    private int a;
    private int b;

    public void sum() {
        System.out.println(a + b);
    }

    public void sub() {
        System.out.println(a - b);
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();

        obj.a = 10;
        obj.b = 5;

        obj.sub();
        obj.sum();
    }
}
