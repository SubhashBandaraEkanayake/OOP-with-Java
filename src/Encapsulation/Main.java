package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Kasun",30);

        System.out.println(human.getName());
        System.out.println(human.getAge());

        human.setName("Santha");
        human.setAge(98);

        System.out.println(human.getName());
        System.out.println(human.getAge());
    }
}
