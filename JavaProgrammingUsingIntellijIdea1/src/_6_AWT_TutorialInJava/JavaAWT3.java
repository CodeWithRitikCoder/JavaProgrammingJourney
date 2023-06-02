//Code a software to create a Frame in the Constructor by Extending Frame class.
package _6_AWT_TutorialInJava;

import java.awt.*;
public class JavaAWT3 extends Frame {
    public JavaAWT3() {
        //Properties of Frame.
        setLayout(null);
        setBounds(1400, 500, 400, 300);
        setTitle("JavaAWT3 Frame");
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("JavaAWT3 Frame.");
        JavaAWT3 javaAWT3= new JavaAWT3();
    }
}
