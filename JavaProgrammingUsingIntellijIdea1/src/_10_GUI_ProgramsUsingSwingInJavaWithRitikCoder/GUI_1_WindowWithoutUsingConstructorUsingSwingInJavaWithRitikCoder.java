//Code a software to Create First GUI Window Without using constructor and Using Swing in Java With RitikCoder.
package _10_GUI_ProgramsUsingSwingInJavaWithRitikCoder;

import javax.swing.*;

public class GUI_1_WindowWithoutUsingConstructorUsingSwingInJavaWithRitikCoder {
//    public GUI_1_WindowUsingSwingInJavaWithRitikCoder() {
//
//
//    }

    public static void main(String[] args) {
        GUI_1_WindowWithoutUsingConstructorUsingSwingInJavaWithRitikCoder GUIWindow1= new GUI_1_WindowWithoutUsingConstructorUsingSwingInJavaWithRitikCoder();
        JFrame jFrame1= new JFrame("First_GUI_WindowUsingSwingWithRitikCoder");



        //Properties of JFrame1.
        jFrame1.setLayout(null);
        jFrame1.setVisible(true);
        jFrame1.setSize(300, 200);
        jFrame1.setDefaultCloseOperation(jFrame1.EXIT_ON_CLOSE);//it is used to Close Frame.
    }
}
