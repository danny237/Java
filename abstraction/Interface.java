package abstraction;

/**
 * Interface
 */
public class Interface {

    public static void main(String[] args) {
        Children obj1 = new Children();
        obj1.show();
        obj1.display();
    }
}
//First Interface
interface Father {
    public void show();
}

//Second Interface
interface Mother {
    public void display();
}

class Children implements Father, Mother {
    public void show() {
        System.out.println("Gyan Bahadur Thapa Magar!");
    }
    public void display() {
        System.out.println("Sara Thapa Magar!");
    }
 }

