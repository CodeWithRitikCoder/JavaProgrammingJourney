package JavaSwingExamples;

import javax.swing.*;

class MyFrame extends JFrame{
    public MyFrame(){//if you don't create default there is no problem.
        //Code to be Executed.
    }
    public MyFrame(String title){
        super(title);
    }
}
public class SecondSwingGUIWindow {
    public static void main(String[] args) {
        System.out.println("Second Swing GUI Window.");

        MyFrame myFrame= new MyFrame("Second GUI Window");
        myFrame.setBounds(1100, 200, 400, 300);
        myFrame.setLayout(null);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
