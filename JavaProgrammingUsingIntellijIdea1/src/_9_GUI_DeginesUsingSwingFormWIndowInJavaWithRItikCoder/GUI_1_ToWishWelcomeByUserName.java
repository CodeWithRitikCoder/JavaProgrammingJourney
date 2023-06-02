package _9_GUI_DeginesUsingSwingFormWIndowInJavaWithRItikCoder;

import javax.swing.*;

public class GUI_1_ToWishWelcomeByUserName extends JFrame {
    private JPanel jPanelMain1;
    private JLabel jLabelForWelcome;
    private JLabel jLabelForEnterName;
    private JTextField textField1;
    private JButton jButtonForGetWishes;
    private JButton jButtonForClear;

    public GUI_1_ToWishWelcomeByUserName() {
        this.setVisible(true);
        this.setBounds(1400, 80, 400, 300);
        this.setLayout(null);
        this.setTitle("RitikCoder's Wishes");
        this.setResizable(false);
    }

    public static void main(String[] args) {
        System.out.println("Your Frame is Created");
        new GUI_1_ToWishWelcomeByUserName();
    }
}