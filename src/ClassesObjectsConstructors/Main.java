package ClassesObjectsConstructors;

public class Main {
    public static void main(String[] args){
        //Create ClassesObjectsConstructors.Human objects/instances
        Human nimal = new Human(44);  //nimal is object in human type(class)
        Human kamal = new Human("red");
        Human sasikala= new Human(88);

        nimal.eat();
        System.out.println("Nimal's age is "+nimal.age);
        System.out.println("Kamal's  fav color is "+ kamal.fColor);
        System.out.println("Sasi's age is "+sasikala.age);

    }
}
