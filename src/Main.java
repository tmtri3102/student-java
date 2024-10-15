public class Main {
    public static void main(String[] args) {
        Student.change(); // no need to create object before
//        s.display(); // gotta create object before
        Student s = new Student(101, "Abin");
        s.display();
        Student s1 = new Student(102, "Abdul");
        s1.display();
    }
}