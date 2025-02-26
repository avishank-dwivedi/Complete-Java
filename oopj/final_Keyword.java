// points added for final keywords


package oopj;

import java.util.ArrayList;
import java.util.List;

public class final_Keyword {

    class Parent {
        final void display() {
            System.out.println("This is a final method.");
        }
    }
    
    class Child extends Parent {
        // void display() {} // Error: Cannot override the final method
    }

    final class Utility {
        void showMessage() {
            System.out.println("Utility class");
        }
    }
    
    // class ExtendedUtility extends Utility {} // Error: Cannot inherit from a final class

    void printMessage(final String message) {
        //message = "New Message"; // Error: Cannot reassign a final parameter
        System.out.println(message);
    }
    
    
    



public static void main(String[] args){
    final List<String> names = new ArrayList<>();
    names.add("Avishank"); // Allowed
    //names = new ArrayList<>(); // Error: Cannot reassign the final variable


 } 
}