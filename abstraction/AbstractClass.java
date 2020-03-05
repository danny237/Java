package abstraction;

/**
 * AbstractClass
 */

public class AbstractClass {
    public static void main(String[] args) {
        Son S = new Son();
        S.display();
        Daughter D = new Daughter();
        D.display(); 
    }
    
}

//abstract class
abstract class Parent {
    abstract void display();
}

class Son extends Parent {
    void display() {
        System.out.println("I am Son!");
    }
}

class Daughter extends Parent {
    void display() {
        System.out.println("I am Daughter!");
    }
}




