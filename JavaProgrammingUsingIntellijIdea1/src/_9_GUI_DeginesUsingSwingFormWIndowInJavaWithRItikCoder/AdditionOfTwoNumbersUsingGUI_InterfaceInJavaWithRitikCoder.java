package _9_GUI_DeginesUsingSwingFormWIndowInJavaWithRItikCoder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionOfTwoNumbersUsingGUI_InterfaceInJavaWithRitikCoder extends JFrame {


    private JPanel AdditionOfTwoNumbersJPanel;
    private JTextField FirstNumberBox;
    private JTextField SecondNumberBox;
    private JTextField ResultField;
    private JButton outputButton;
    private JButton clearButton;
    private JLabel ResultLevel;

    //Constructor is here.
    public AdditionOfTwoNumbersUsingGUI_InterfaceInJavaWithRitikCoder(){
        setContentPane(AdditionOfTwoNumbersJPanel);
        setTitle("@RitikCoder.");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(420, 300);

        //Some Actions.
        outputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int firstNumber= Integer.parseInt(FirstNumberBox.getText());
                int secondNumber= Integer.parseInt(SecondNumberBox.getText());
                ResultLevel.setText(" Addition of your number = "+ (firstNumber+ secondNumber));
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstNumberBox.setText("");
                SecondNumberBox.setText("");
                ResultLevel.setText("");
            }
        });
    }

    public static void main(String[] args) {
        System.out.println("RitikCoder's GUI Software.");
        AdditionOfTwoNumbersUsingGUI_InterfaceInJavaWithRitikCoder aa1= new AdditionOfTwoNumbersUsingGUI_InterfaceInJavaWithRitikCoder();

    }
}
