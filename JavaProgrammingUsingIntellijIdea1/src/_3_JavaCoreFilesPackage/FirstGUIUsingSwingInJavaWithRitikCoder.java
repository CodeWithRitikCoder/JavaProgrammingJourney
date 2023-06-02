package _3_JavaCoreFilesPackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstGUIUsingSwingInJavaWithRitikCoder extends JFrame {
    private JPanel MainPannelWithRitikCoder;
    private JTextField txtName;
    private JButton clickMeButton;

    public FirstGUIUsingSwingInJavaWithRitikCoder() {
        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(clickMeButton, txtName.getText()+", Hello");
                JOptionPane.showMessageDialog(clickMeButton, "Hello, "+ txtName.getText());
            }
        });
    }

    public static void main(String[] args) {
        FirstGUIUsingSwingInJavaWithRitikCoder h= new FirstGUIUsingSwingInJavaWithRitikCoder();
        h.setContentPane(h.MainPannelWithRitikCoder);
        h.setTitle("@RitikCoder's GUI");
        h.setBounds(1450, 450, 300, 200);
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
