package Encapsulation;

public class Human {
    private String name;
    private int age;

    //These private attributes can access only same class

    Human(String name,int age){
        this.name = name;
        this.age = age;
    }

    //Attributes will be private and can access them using getters & setters

    //Getters
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}
