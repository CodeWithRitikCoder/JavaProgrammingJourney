//Code a software to create a Frame in the main method without extending Frame class.
package _6_AWT_TutorialInJava;

import java.awt.*;

public class JavaAWT2 {
    public static void main(String[] args) {
        System.out.println("JavaAWT2 Frame.");

        Frame frame1= new Frame("JavaAWT2 Frame.");

        //Properties of a Frame.
        frame1.setLayout(null);
        frame1.setSize(400, 300);
        frame1.setLocation(1400, 500);
        frame1.setVisible(true);
    }
}
