package oopj;

interface Animal {
    void eat();
    void sleep();
}

interface Pet extends Animal {
    void play();
}

class Cat implements Pet {
    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping.");
    }

    @Override
    public void play() {
        System.out.println("Cat is playing.");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Pet myCat = new Cat();
        myCat.eat();
        myCat.sleep();
        myCat.play();
    }
}

