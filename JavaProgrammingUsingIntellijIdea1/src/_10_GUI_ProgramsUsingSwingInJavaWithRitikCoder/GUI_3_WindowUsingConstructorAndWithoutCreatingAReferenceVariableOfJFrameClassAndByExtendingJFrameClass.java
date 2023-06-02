////Code a software to Create First GUI Window using constructor without creating
// a reference variable of JFrame class and by extending JFrame class and Using
// Swing in Java With RitikCoder.
package _10_GUI_ProgramsUsingSwingInJavaWithRitikCoder;

import javax.swing.*;
public class GUI_3_WindowUsingConstructorAndWithoutCreatingAReferenceVariableOfJFrameClassAndByExtendingJFrameClass extends JFrame {
    public GUI_3_WindowUsingConstructorAndWithoutCreatingAReferenceVariableOfJFrameClassAndByExtendingJFrameClass() {



        //Properties of JFrame.
        setLayout(null);
        setTitle("GUI-3_Window");
        setSize(400, 300);
        setVisible(true);
        setBounds(1400, 500, 400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);//it is used to Close Frame.
    }

    public static void main(String[] args) {
        new GUI_3_WindowUsingConstructorAndWithoutCreatingAReferenceVariableOfJFrameClassAndByExtendingJFrameClass();
    }
}
