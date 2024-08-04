package Abstraction;

public abstract class Human {
    //Abstract classes can't be instantiated objects,but they can have a subclass
    boolean isMarried = true;

    void drink(){
        System.out.println("He is drinking.");
    }

    //Abstract methods are declared without an implementation
    abstract void run();

}
