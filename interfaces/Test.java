package interfaces;

interface Vehicle {
    // Abstract methods defined
    void changeGear(int a);

    void speedUp(int a);

    void applyBreaks(int a);
}

class Bicycle implements Vehicle {
    int speed;
    int gear;

    // Change gear
    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    // Increase speed
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBreaks(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("Speed: \t" + speed + " gear: \t" + gear);
    }
}

public class Test {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.changeGear(2);
        b.speedUp(5);
        b.applyBreaks(1);

        b.printStates();
    }
}
