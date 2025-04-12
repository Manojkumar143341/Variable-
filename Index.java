public class Student {
    static String college = "CIET"; // static variable
    String name; // instance variable

    void display() {
        int age = 20; // local variable
        System.out.println(name + " from " + college + " is " + age + " years old.");
    }
}
