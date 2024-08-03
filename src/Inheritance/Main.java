package Inheritance;

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student(25,99);
        Student std2 = new Student(44,77);

        std1.eat();
        System.out.println(std1.age);

        std2.learn();
        System.out.println(std2.marks);


    }
}
