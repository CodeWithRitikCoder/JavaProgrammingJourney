//Code a software to Add a Label & TextField into the Frame.
package _6_AWT_TutorialInJava;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaAWT7 {
    public JavaAWT7() {
        Frame frame4= new Frame("JavaAWT7 Frame.");

        //Creation of other things.
        Label label2= new Label("Enter your name :- ");
        label2.setBounds(50, 50 , 100, 30);
        TextField textField1= new TextField();
        textField1.setBounds(160, 50, 150, 30);

        //Adding Other Created things into the Frame.
        frame4.add(label2);
        frame4.add(textField1);

        //Properties of Frame.
        frame4.setLayout(null);
        frame4.setBounds(1400, 500, 400, 300);
        frame4.setVisible(true);
        frame4.setResizable(false);
        frame4.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame4.dispose();
            }
        });
    }

    public static void main(String[] args) {
        System.out.println("JavaAWT7 Frame");
        JavaAWT7 javaAWT7= new JavaAWT7();
    }
}
