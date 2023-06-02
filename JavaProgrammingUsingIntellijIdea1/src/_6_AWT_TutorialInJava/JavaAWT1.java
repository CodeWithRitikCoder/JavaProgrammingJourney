//Code a software to create a Frame in the constructor without Extending Frame Class.
package _6_AWT_TutorialInJava;

import java.awt.*;

public class JavaAWT1 {
    public JavaAWT1() {
        Frame frame= new Frame();

        //Properties of Frame.
        frame.setLayout(null);
        frame.setSize(400, 300);
        frame.setLocation(1400, 500);
        frame.setTitle("JavaAWT1 Frame");
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        System.out.println("JavaAWT1 Frame.");
        //new JavaAWT1();
        JavaAWT1 javaAWT1= new JavaAWT1();
    }
}