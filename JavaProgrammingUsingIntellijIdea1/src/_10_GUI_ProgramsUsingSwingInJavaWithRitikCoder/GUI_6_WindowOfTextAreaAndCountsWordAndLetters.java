//Code a software to created GUI window to work change something by
// clicking on button using swing in Java WithRitikCoder.
package _10_GUI_ProgramsUsingSwingInJavaWithRitikCoder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_6_WindowOfTextAreaAndCountsWordAndLetters {
    public GUI_6_WindowOfTextAreaAndCountsWordAndLetters() {
        JFrame jFrame= new JFrame("TextArea");
        //Creation of other thing like button, label and show on..
        JLabel jLabelForWelcome= new JLabel("Welcome to RitikCoder's TEXTAREA");
        jLabelForWelcome.setBounds(85, 50, 220, 30);
        JButton jButtonForChangeLabel= new JButton("Click here to Change Label");
        jButtonForChangeLabel.setBounds(70, 100, 250, 40);
        JTextArea jTextArea1= new JTextArea();
        jTextArea1.setBounds(10, 10, 50, 50);
        JLabel jLabelForChangeLabel= new JLabel("Changeable Label");
        jLabelForChangeLabel.setBounds(135, 25, 200, 20);
        JLabel jLabelForSaySomething= new JLabel("Click on the button to see changing label");
        jLabelForSaySomething.setBounds(80, 70, 250, 20);

        //adding of created things into the frame.
        jFrame.add(jButtonForChangeLabel);
        jFrame.add(jLabelForWelcome);
        jFrame.add(jLabelForChangeLabel);
        jFrame.add(jLabelForSaySomething);
        jFrame.add(jTextArea1);

        //Properties of Frame.
        jFrame.setBounds(1400, 500, 400, 200);
        jFrame.setVisible(true);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

        //Functionality of created things.
        jButtonForChangeLabel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabelForChangeLabel.setText("RitikCoder is Back");
                JOptionPane.showMessageDialog(jButtonForChangeLabel, "Your label is changed. ! ");
            }
        });

    }

    public static void main(String[] args) {
        GUI_6_WindowOfTextAreaAndCountsWordAndLetters GUI1= new GUI_6_WindowOfTextAreaAndCountsWordAndLetters();
    }
}
