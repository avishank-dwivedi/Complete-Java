//private
package oopj;
/*
class Parent {
    private int value = 10;

    private void display() {
        System.out.println("Private Method: " + value);
    }

    void accessPrivate() {
        display(); // Accessible within the same class
    }
}

public class Acces_modifier {
    public static void main(String[] args) {
        Parent parent = new Parent();
        // parent.value;   // Error: 'value' has private access
        // parent.display(); // Error: 'display()' has private access
        parent.accessPrivate(); // Indirectly access private member
    }
}


// default

class Parent {
    int value = 20; // default access

    void display() {
        System.out.println("Default Method: " + value);
    }
}

public class  Acces_modifier {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display(); // Accessible in the same package
    }
}


// protected

class Parent {
    protected int value = 30;

    protected void display() {
        System.out.println("Protected Method: " + value);
    }
}

class Child extends Parent {
    void show() {
        display(); // Accessing protected member from subclass
    }
}

public class Acces_modifier {
    public static void main(String[] args) {
        Child child = new Child();
        child.show(); // Access via inheritance
    }
}

*/


// public

class Parent {
    public int value = 40;

    public void display() {
        System.out.println("Public Method: " + value);
    }
}

public class Acces_modifier {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display(); // Accessible everywhere
    }
}
