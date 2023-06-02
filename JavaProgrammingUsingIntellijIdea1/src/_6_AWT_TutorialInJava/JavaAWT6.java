//Code a software to Add a Label into the Frame.
package _6_AWT_TutorialInJava;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaAWT6 {
    public JavaAWT6() {
        Frame frame3= new Frame("JavaAWT 6 Frame");

        //Creation of Label.
        Label label1= new Label("Welcome To My JavaAWT6 Frame.");
        label1.setBounds(100, 50, 200, 30);

        //Adding of Label into the Frame.
        frame3.add(label1);

        //Properties of Frame.
        frame3.setLayout(null);
        frame3.setBounds(1400, 500, 400, 300);
        frame3.setVisible(true);
        frame3.setResizable(false);
        frame3.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame3.dispose();
            }
        });
    }

    public static void main(String[] args) {
        System.out.println("JavaAWT6 Frame");
        JavaAWT6 javaAWT6= new JavaAWT6();
    }
}
