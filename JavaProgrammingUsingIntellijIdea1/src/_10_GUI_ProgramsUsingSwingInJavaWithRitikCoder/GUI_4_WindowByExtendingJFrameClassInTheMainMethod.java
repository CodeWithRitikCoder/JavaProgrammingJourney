//Code a software to Create a GUI 4 window by extending JFrame class and without
//creating a constructor and all properties is define into the main method by using object of class
// using Swing.
package _10_GUI_ProgramsUsingSwingInJavaWithRitikCoder;

import javax.swing.*;

public class GUI_4_WindowByExtendingJFrameClassInTheMainMethod extends JFrame {
//    GUI_4_WindowByExtendingJFrameClassInTheMainMethod(){
//
//    }

    public static void main(String[] args) {
        GUI_4_WindowByExtendingJFrameClassInTheMainMethod GUI= new GUI_4_WindowByExtendingJFrameClassInTheMainMethod();
        GUI.setLayout(null);
        GUI.setTitle("GUI_4th_window");
        GUI.setVisible(true);
        GUI.setBounds(1400, 500, 400,300);
        GUI.setDefaultCloseOperation(GUI.EXIT_ON_CLOSE);//it is used to Close Frame.


    }
}
