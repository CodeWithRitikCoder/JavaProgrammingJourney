//Code a software to fill Background and Foreground Color of Frame, Label, TextField and Button - show on ---.
package _6_AWT_TutorialInJava;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaAWT10 {
    public JavaAWT10() {
        Frame frame7= new Frame("JavaAWT10 Frame");

        //Creation of other things is here.
        Label label4= new Label("Enter your name :- ");
        label4.setBounds(50, 50, 110, 30);
        label4.setBackground(Color.RED);
        label4.setForeground(Color.YELLOW);
        TextField textField3= new TextField();
        textField3.setBounds(170, 50, 150, 30);
        textField3.setBackground(Color.BLUE);
        textField3.setForeground(Color.WHITE);
        Button button2= new Button("Click Me");
        button2.setBounds(150, 150, 80, 50);
        button2.setBackground(Color.YELLOW);
        button2.setForeground(Color.BLUE);

        //Adding of other created things into the Frame.
        frame7.add(label4);
        frame7.add(textField3);
        frame7.add(button2);

        //Properties of Frame.
        frame7.setLayout(null);
        frame7.setBounds(1400, 500, 400, 300);
        frame7.setResizable(false);
        frame7.setVisible(true);
        frame7.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame7.dispose();
            }
        });
        frame7.setBackground(Color.BLACK);
    }

    public static void main(String[] args) {
        System.out.println("JavaAWT10 Frame");
        JavaAWT10 javaAWT10= new JavaAWT10();
    }
}
