//Code a software to Create a GUI 5 window without extending JFrame class
//and creating Global reference variable of JFrame Class. using Swing.
package _10_GUI_ProgramsUsingSwingInJavaWithRitikCoder;

import javax.swing.*;

public class GUI_5_WindowWithoutExtendingJFrameClassAndCreatingAGlobalReferenceVariableOfJFrameClass {
    //Globally creation of JFrame class.
    public JFrame jFrame1;
    public GUI_5_WindowWithoutExtendingJFrameClassAndCreatingAGlobalReferenceVariableOfJFrameClass() {
        jFrame1= new JFrame("GUI window 5");//creating a reference variable of JFrame class.


        //Properties of JFrame1.
        jFrame1.setLayout(null);
        jFrame1.setBounds(1400, 500, 400, 300);
        jFrame1.setVisible(true);
        jFrame1.setLayout(null);
        jFrame1.setDefaultCloseOperation(jFrame1.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GUI_5_WindowWithoutExtendingJFrameClassAndCreatingAGlobalReferenceVariableOfJFrameClass();
    }
}
