//Code a software ot Change Font-(Face, style, size) of Labels, TextFields and Buttons show on.....
package _6_AWT_TutorialInJava;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaAWT11 extends Frame {
    private Label label5;
    private TextField textField4;
    private Button button3;
    private Font font1, font2, font3;
    public JavaAWT11() {
        //Properties of Fonts.
        font1= new Font("Cascadia Mono", Font.BOLD, 15);
        font2= new Font("OMR", Font.ITALIC, 20);
        font3= new Font("Elephant", Font.PLAIN, 25);

        //Properties of other created things.
        label5= new Label("Enter your name :- ");
        label5.setBounds(30, 50, 150, 30);
        label5.setFont(font1);
        textField4= new TextField();
        textField4.setBounds(180, 50, 150, 30);
        textField4.setFont(font2);
        button3= new Button("Click Me");
        button3.setBounds(150, 150, 130, 50);
        button3.setFont(font3);

        //Adding of Created things is here.
        add(label5);
        add(textField4);
        add(button3);

        //Properties of Frame.
        setLayout(null);
        setBounds(1400, 500, 400, 300);
        setResizable(false);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        System.out.println("JavaAWT11 Frame.");
        JavaAWT11 javaAWT11= new JavaAWT11();
    }
}