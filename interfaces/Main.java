package interfaces;

interface Add {
    int add(int a, int b);
}

interface Sub {
    int sub(int a, int b);
}

class Calc implements Add, Sub {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calc newCalc = new Calc();
        System.out.println("Addtion: " + newCalc.add(10, 20));
        System.out.println("Subtraction: " + newCalc.sub(100, 20));
    }
}
