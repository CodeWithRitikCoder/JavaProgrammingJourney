package _9_GUI_DeginesUsingSwingFormWIndowInJavaWithRItikCoder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private JTextField tfFirstName;
    private JTextField tfLastName;
    private JButton btnOK;
    private JButton btnClear;
    private JLabel lbWelcome;
    private JPanel mainPanel;

    //Constructor here.
    public MainFrame(){
        setContentPane(mainPanel);
        setTitle("@RitikCoder's GUI");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName= tfFirstName.getText();
                String lastName= tfLastName.getText();
                lbWelcome.setText("  ***Welcome "+ firstName+ " "+ lastName+ "***");
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfFirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("");
            }
        });
    }

    public static void main(String[] args) {
        MainFrame myFrame= new MainFrame();
    }
}
