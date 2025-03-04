public class Dog {
    String name;
    String breed;
    int age;
    String color;

    // Constructor
    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    // Method 1
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return ("Name is: " + this.getName() + "\t" + this.getBreed());
    }

    public static void main(String[] args) {
        Dog poppy = new Dog("Poppy", "German Shepherd", 5, "Black");
        System.out.println(poppy.toString());
    }
}
