public class Human{
    String name; //variable
    int age;
    String fColor;


    /*
    Constructor - special method that is used to initialize objects.
    The constructor is called when an object of a class  is created.
    It can be used to set initial values for object attributes.
    */

    void eat(){ //method
        System.out.println("He is eating");
    }

    Human(int age){
        this.age = age;
    }

    Human(String favColor){
        this.fColor = favColor;
    }

    //So now Human is a class which can make objects based on it

}

