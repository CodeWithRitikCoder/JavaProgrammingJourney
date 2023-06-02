//Code a software to change Background and Foreground Color of Frame.
package _6_AWT_TutorialInJava;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaAWT9 {
    public JavaAWT9() {
        Frame frame6= new Frame("JavaAWT9 Frame");

        //Properties of Frame.
        frame6.setLayout(null);
        frame6.setBounds(1400, 500, 400, 300);
        frame6.setResizable(false);
        frame6.setVisible(true);
        frame6.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame6.dispose();
            }
        });
        frame6.setBackground(Color.BLACK);
    }

    public static void main(String[] args) {
        System.out.println("JavaAWT9 Frame.");
        JavaAWT9 javaAWT9= new JavaAWT9();
    }
}
