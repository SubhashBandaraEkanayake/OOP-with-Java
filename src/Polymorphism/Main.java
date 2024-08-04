package Polymorphism;

public class Main {
    public static void main(String[] args) {
        //The ability of an object to identify as more than one type
        Student std1 = new Student();
        Employee emp1 = new Employee();
        Politician poli1 = new Politician();

//        std.eat();
//        emp.eat();
//        poli.eat();

        Human std2 = new Student();
        std2.learn();
        Human emp2 = new Employee();
        emp2.eat();  //eat() method of human class is overrided by eat() method of employee class
        Human poli2 = new Politician();
        poli2.learn();


    }
}
