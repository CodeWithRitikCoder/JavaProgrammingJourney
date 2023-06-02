//Code a software to create a Globally Frame in the class and in the Constructor without Extending Frame class and Close button will work.
package _6_AWT_TutorialInJava;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaAWT5 {
    //Globally Frame Creation.
    Frame frame2;
    public JavaAWT5() {
        frame2= new Frame("JavaAWT5 Frame");

        //Properties of Frame.
        frame2.setLayout(null);
        frame2.setBounds(1400, 500, 400, 300);
        frame2.setResizable(false);
        frame2.setVisible(true);
        frame2.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame2.dispose();
            }
        });
    }

    public static void main(String[] args) {
        System.out.println("JavaAWT5 Frame.");
        JavaAWT5 javaAWT5= new JavaAWT5();
    }
}
