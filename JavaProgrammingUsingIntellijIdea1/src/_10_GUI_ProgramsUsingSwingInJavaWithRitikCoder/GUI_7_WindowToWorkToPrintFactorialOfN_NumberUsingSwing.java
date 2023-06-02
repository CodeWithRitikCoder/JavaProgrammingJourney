package _10_GUI_ProgramsUsingSwingInJavaWithRitikCoder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUI_7_WindowToWorkToPrintFactorialOfN_NumberUsingSwing {
    private JPanel MainPanel;
    private JLabel jLabelForWelcome, jLabelForEnterNumber, jLabelForShowAboutSoftware;
    private JTextField jTextFieldForGetNumber;
    private JButton jButtonForGetFactorial, jButtonForClearTextField;

    public GUI_7_WindowToWorkToPrintFactorialOfN_NumberUsingSwing() {
        JFrame jFrame= new JFrame("Integer Number checker");//creation Reference of JFrame class.

        //Properties of Created things
        jLabelForWelcome= new JLabel("Welcome to RitikCoder's Software");
        jLabelForWelcome.setBounds(80, 10, 200, 50);
        jLabelForEnterNumber= new JLabel("Enter your number here = ");
        jLabelForEnterNumber.setBounds(20, 60, 150, 50);
        jTextFieldForGetNumber= new JTextField();
        jTextFieldForGetNumber.setBounds(170, 70, 180, 30);
        jLabelForShowAboutSoftware= new JLabel("Find out Factorial of your Entered number");
        jLabelForShowAboutSoftware.setBounds(60, 110, 260, 50);
        jButtonForGetFactorial= new JButton("Check your number");
        jButtonForGetFactorial.setBounds(30, 180, 150, 40);
        jButtonForClearTextField= new JButton("Clear Text Area");
        jButtonForClearTextField.setBounds(200, 180, 150, 40);

        //Adding of created things into Frame.
        jFrame.add(jLabelForWelcome);
        jFrame.add(jLabelForEnterNumber);
        jFrame.add(jTextFieldForGetNumber);
        jFrame.add(jLabelForShowAboutSoftware);
        jFrame.add(jButtonForGetFactorial);
        jFrame.add(jButtonForClearTextField);


        //Properties of JFrame.
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setBounds(1400, 450, 400, 300);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        Container c= jFrame.getContentPane();
        c.setBackground(Color.CYAN);
        jFrame.setResizable(false);

        //ImageIcon is here.
        ImageIcon imageIcon1= new ImageIcon("Picture3.png");
        jFrame.setIconImage(imageIcon1.getImage());

        //Functionality of Created things.
        jButtonForGetFactorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a= Integer.parseInt(jTextFieldForGetNumber.getText());
                if(a>= 1){
                    int fact= 1;
                    for(int i= 1; i<= a; i++){
                        fact= fact* i;
                    }
                    JOptionPane.showMessageDialog(jButtonForGetFactorial, " "+ fact+ " = is the Factorial of "+ a);
//                    JOptionPane.showInternalMessageDialog(true);
                }else{
                    JOptionPane.showMessageDialog(jButtonForGetFactorial,"Please Enter valid value");
                }
            }
        });
        jButtonForClearTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextFieldForGetNumber.setText("");
            }
        });

    }

    public static void main(String[] args) {
        new GUI_7_WindowToWorkToPrintFactorialOfN_NumberUsingSwing();
    }
}
