package Abstraction;

public class Employee extends Human {
    int salary = 25000;

    void work(){
        System.out.println("He is working.");
    }

    @Override
    void run() {
        System.out.println("Employee is running.");
    }
}
