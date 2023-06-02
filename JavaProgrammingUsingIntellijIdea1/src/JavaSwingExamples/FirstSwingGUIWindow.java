package JavaSwingExamples;

import javax.swing.*;

public class FirstSwingGUIWindow {
    public static void main(String[] args) {
        System.out.println("First Swing GUI window.");

        JFrame jFrame= new JFrame("First Swing GUI Window");
        jFrame.setLayout(null);
        jFrame.setSize(300, 200);
        jFrame.setLocation(1100, 200);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
