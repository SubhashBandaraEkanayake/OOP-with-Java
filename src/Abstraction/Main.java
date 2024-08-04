package Abstraction;

public class Main {
    public static void main(String[] args){
//          Human human = new Human(); //parent class object
//          human.drink();
//          System.out.println(human.isMarried);

          Employee emp = new Employee(); //child class object
          emp.work(); //from child class
          emp.drink(); //from parent class
          emp.run();
          System.out.println(emp.salary);
          System.out.println(emp.isMarried);
    }
}
