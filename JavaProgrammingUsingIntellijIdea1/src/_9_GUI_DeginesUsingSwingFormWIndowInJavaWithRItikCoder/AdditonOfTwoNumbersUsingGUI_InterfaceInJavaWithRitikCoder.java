package _9_GUI_DeginesUsingSwingFormWIndowInJavaWithRItikCoder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditonOfTwoNumbersUsingGUI_InterfaceInJavaWithRitikCoder extends JFrame{
    private JTextField StringToReplace;
    private JTextField ReplacedString;
    private JTextField result;
    private JButton ClearButton;
    private JButton OutPutButton;
    private JPanel AdditionOfTwoNumberFrame;
    private JLabel Result;
    private JTextField YourString;
    private JLabel Result1;

    //Constructor is here..
    public AdditonOfTwoNumbersUsingGUI_InterfaceInJavaWithRitikCoder(){
        setContentPane(AdditionOfTwoNumberFrame);
        setTitle("@RitikCoder's GUI");
        setSize(500, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        OutPutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String yourString= YourString.getText();
                String a= StringToReplace.getText();
                String b= ReplacedString.getText();
                Result1.setText(" Your Entered String = "+ yourString);
                Result.setText(" Your Replaced String = "+ yourString.replace(a, b));
            }
        });
        ClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                YourString.setText("");
                StringToReplace.setText("");
                ReplacedString.setText("");
                Result1.setText("");
                Result.setText("");
            }
        });
    }


    public static void main(String[] args) {
        AdditonOfTwoNumbersUsingGUI_InterfaceInJavaWithRitikCoder a1= new AdditonOfTwoNumbersUsingGUI_InterfaceInJavaWithRitikCoder();


    }
}
