abstract class MainTVRemote {
    abstract void turnOn();

    abstract void turnOff();
}

class TVRemote extends MainTVRemote {
    @Override
    void turnOn() {
        System.out.println("TV Turned On~");
    }

    @Override
    void turnOff() {
        System.out.println("TV Turned OFF!");
    }
}

public class AbstractionOOP {
    public static void main(String[] args) {
        MainTVRemote remote = new TVRemote();
        remote.turnOn();
        remote.turnOff();
    }
}
