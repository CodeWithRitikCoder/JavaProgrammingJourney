//Code a software to Create a Frame in the main method by Extending Frame class.
package _6_AWT_TutorialInJava;

import java.awt.*;

public class JavaAWT4 extends Frame {
    public static void main(String[] args) {
        System.out.println("JavaAWT4 Frame.");
        JavaAWT4 javaAWT4= new JavaAWT4();

        //Properties of Frame.
        javaAWT4.setLayout(null);
        javaAWT4.setBounds(1400, 500, 400, 300);
        javaAWT4.setTitle("JavaAWT4 Frame");
        javaAWT4.setResizable(false);
        javaAWT4.setVisible(true);

    }
}
