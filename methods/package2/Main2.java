package methods.package2;

import methods.package1.Main;

public class Main2 {
    public static void main(String[] args) {
        Main m = new Main();

        // m.display(); // we cannot access this method because it was declared with
        // 'default' modifier
    }
}
