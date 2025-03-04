class Student {
    public int roll_no;
    public String name;

    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student[] arr;

        arr = new Student[5];

        arr[0] = new Student(1, "John");
        arr[1] = new Student(2, "Jabel");
        arr[2] = new Student(3, "Amari");
        arr[3] = new Student(4, "Doe");
        arr[4] = new Student(5, "Jane");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Student Name: " + arr[i].name + "\t" + "Roll No.: " + arr[i].roll_no);
        }

    }
}
