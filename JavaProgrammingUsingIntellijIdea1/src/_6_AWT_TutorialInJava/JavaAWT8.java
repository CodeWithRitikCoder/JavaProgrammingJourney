//Code a software to Add a Label, TextField & Button into the Frame.
package _6_AWT_TutorialInJava;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaAWT8 {
    public JavaAWT8() {
        Frame frame5= new Frame("JavaAWT8 Frame");

        //Creation of Other things.
        Label label3= new Label("Enter your name :- ");
        label3.setBounds(50, 50, 100, 30);
        TextField textField2= new TextField();
        textField2.setBounds(160, 50, 150, 30);
        Button button1= new Button("Click Me");
        button1.setBounds(150, 150, 80, 50);

        //Addition of other created things into the Frame.
        frame5.add(label3);
        frame5.add(textField2);
        frame5.add(button1);

        //Properties of Frame.
        frame5.setLayout(null);
        frame5.setBounds(1400, 500, 400, 300);
        frame5.setVisible(true);
        frame5.setResizable(false);
        frame5.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame5.dispose();
            }
        });
    }

    public static void main(String[] args) {
        System.out.println("JavaAWT8 Frame.");
        JavaAWT8 javaAWT8= new JavaAWT8();
    }
}
