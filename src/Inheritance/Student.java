package Inheritance;

public class Student extends Human{ //Child,sub class
    int marks = 100;

    Student(int age, int marks){
        super(age);
        this.marks = marks;
    }

    void learn(){
        System.out.println("He is learning.");
    }
    void eat(){ //method overiding
        System.out.println("Student is eating.");
    }
}
