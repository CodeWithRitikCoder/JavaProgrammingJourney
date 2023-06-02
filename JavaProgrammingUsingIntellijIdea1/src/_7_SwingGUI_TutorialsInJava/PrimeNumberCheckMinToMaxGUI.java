package _7_SwingGUI_TutorialsInJava;

import javax.swing.*;
import java.awt.*;

class GUIToCheckMinToMaxPrimeOrNot extends JFrame {
    JLabel jLabelForWelcome;
    Font font1;
    public GUIToCheckMinToMaxPrimeOrNot(){
        JFrame jFrame= new JFrame("Prime No From Min to Max");
        jFrame.setBounds(1000, 100, 300, 200);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
        Container c= jFrame.getContentPane();
        c.setBackground(Color.BLACK);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Bounds Setting of Components.
        jLabelForWelcome.setBounds(20, 30, 300, 40);
        jLabelForWelcome.setBackground(Color.WHITE);
        jLabelForWelcome.setForeground(Color.YELLOW);

        //Properties of components.
        font1= new Font("Cascadia Mono PL", Font.ITALIC, 5);
        jLabelForWelcome.setFont(font1);


        //Adding Components into the JFrame.
        jFrame.setLayout(null);
        jFrame.add(jLabelForWelcome);
    }

}
public class PrimeNumberCheckMinToMaxGUI {
    public static void main(String[] args) {
        System.out.println("GUI Example 1 to Check a number Form Min to Max with Total.");

        GUIToCheckMinToMaxPrimeOrNot guiToCheckMinToMaxPrimeOrNot= new GUIToCheckMinToMaxPrimeOrNot();
    }
}
