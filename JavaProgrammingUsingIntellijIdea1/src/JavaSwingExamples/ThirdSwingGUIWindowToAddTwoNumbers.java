package JavaSwingExamples;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame1 extends JFrame {
    private JLabel jLabel1, jLabel2, jLabel3, jLabel4;
    private JTextField jTextField1, jTextField2;
    private JButton jButtonForResult, jButtonForClear;
    public MyFrame1(String title){
        super(title);
    }

    //Component initialization method.
    public void setComponents(){
        jLabel1= new JLabel("Addition of two Numbers.");
        jLabel2= new JLabel("Enter your First number :- ");
        jLabel3= new JLabel("Enter your Second number :- ");
        jLabel4= new JLabel();
        jTextField1= new JTextField();
        jTextField2= new JTextField();
        jButtonForResult= new JButton("Result");
        jButtonForClear= new JButton("Clear");
//        setLayeredPane(null);
        jLabel1.setBounds(100, 20, 200, 20);
        jLabel2.setBounds(25, 70, 200, 20);
        jTextField1.setBounds(175, 70, 150, 20);
        jLabel3.setBounds(25, 115, 180, 20);
        jTextField2.setBounds(190, 115, 150, 20);
        jButtonForResult.setBounds(60, 160, 100, 40);
        jButtonForClear.setBounds(220, 160, 100, 40);
        jLabel4.setBounds(100, 220, 200, 20);

        //Adding of created components of JavaSwing.
        add(jLabel1);
        add(jLabel2);
        add(jTextField1);
        add(jLabel3);
        add(jTextField2);
        add(jButtonForResult);
        add(jButtonForClear);
        add(jLabel4);

        //Action performed methods.
        jButtonForResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a= Integer.parseInt(jTextField1.getText());
                int b= Integer.parseInt(jTextField2.getText());
                jLabel4.setText("Addition is :- "+ String.valueOf(a+ b));
            }
        });

        jButtonForClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField1.setText("");
                jTextField2.setText("");
            }
        });
    }
}
public class ThirdSwingGUIWindowToAddTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Third Swing GUI Window to Add two numbers.");

        MyFrame1 myFrame1= new MyFrame1("ThirdSwingGUIWindow");
        myFrame1.setComponents();
        myFrame1.setLayout(null);
        myFrame1.setBounds(900, 0xc8, 400, 300);
        myFrame1.setVisible(true);
        myFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
