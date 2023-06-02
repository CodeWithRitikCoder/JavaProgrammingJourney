//Code a software to Create First GUI Window using constructor with Creating
// reference Variable of JFrameClass and Using Swing in Java With RitikCoder.
package _10_GUI_ProgramsUsingSwingInJavaWithRitikCoder;

import javax.swing.*;

public class GUI_2_WindowUsingConstructorUsingSwingInJavaWithRitikCoder {
    public GUI_2_WindowUsingConstructorUsingSwingInJavaWithRitikCoder() {
        JFrame jFrame1= new JFrame("GUI_2");


        //Properties of jFrame1.
        jFrame1.setLayout(null);
        jFrame1.setVisible(true);
        jFrame1.setBounds(1400, 500, 300, 200);
        jFrame1.setDefaultCloseOperation(jFrame1.EXIT_ON_CLOSE);//it is used to Close Frame.
    }

    public static void main(String[] args) {
        new GUI_2_WindowUsingConstructorUsingSwingInJavaWithRitikCoder();
    }
}
