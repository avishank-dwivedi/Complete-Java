package oopj;

class Shape {
    void draw() {
        System.out.println("Drawing a Shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        Shape s;

        s = new Shape();
        s.draw();

        s = new Circle(); // Shape reference points to Circle object
        s.draw(); // Outputs: Drawing a Circle

        s = new Rectangle(); // Shape reference points to Rectangle object
        s.draw(); // Outputs: Drawing a Rectangle

        
        
    }
}
