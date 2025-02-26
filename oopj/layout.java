package oopj;

import java.awt.*;

public class layout {
    public static void main(String[] args) {
        Frame frame = new Frame("BorderLayout Example");
        frame.setLayout(new BorderLayout());  // Set the layout manager to BorderLayout

        // Add components to different regions
        frame.add(new Button("North Button"), BorderLayout.NORTH);
        frame.add(new Button("South Button"), BorderLayout.SOUTH);
        frame.add(new Button("East Button"), BorderLayout.EAST);
        frame.add(new Button("West Button"), BorderLayout.WEST);
        frame.add(new Button("Center Button"), BorderLayout.CENTER);

        frame.setSize(400, 300);
        frame.setVisible(true);

        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent we) {
                System.exit(0);  // Close the application
            }
        });
    }
}
