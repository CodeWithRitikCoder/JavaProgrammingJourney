package _3_JavaCoreFilesPackage;//Code a software to Create fist GUI interface in Java With RitikCoder.

//importing statements.
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class AWTExample extends Frame{
    public AWTExample(){
        //Creating other things here like buttons, label and show on...
        Button b1= new Button("Login");
        b1.setBounds(30, 100, 50, 40);

        //Adding created things here.
        add(b1);

        //Properties of Frame.
        setSize(300, 300);
        setBounds(1400, 500, 300, 300);
        setTitle("@RitikCoder is Back.");
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
}

public class FirstGUIInterFaceInJavaWithRitikCoder {
    public static void main(String[] args) {
        System.out.println("\t This is My Fist GUI interface program in Java.");
        AWTExample a1= new AWTExample();
    }
}