class Helper {
    static int Multiply(int a, int b) {
        return a * b;
    }

    static double Multiply(double a, double b) {
        return a * b;
    }
}

public class PolymophismOne {
    public static void main(String[] args) {
        System.out.println(Helper.Multiply(10, 20));
        System.out.println(Helper.Multiply(10.0, 20.5));
    }
}
