class Programmer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class EncapsulationOne {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.setName("John");
        System.out.println("Name: " + p.getName());
    }
}
