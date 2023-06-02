//Code a software to Degine Login windows using AWT_API in java with RitikCoder.
package _8_AWT_GUI_ProgramsWithRitikCoder;
//importing statements is here.
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

class GUI_Login extends Frame{
    GUI_Login(){
        //Creating things is here.
        Frame f1= new Frame();
        Label labelWelcome= new Label(" Welcome To RitikCoder's GUI.");
        Label labelUserID= new Label("User ID := ");
        Label labelPassword= new Label("Password := ");
        TextField textFieldForUserID= new TextField();
        JPasswordField jPasswordField= new JPasswordField();
        Button buttonLogin= new Button("Login");
        Button buttonCancel= new Button("Cancel");

        //Created things added here.
        f1.add(labelUserID);
        f1.add(labelPassword);
        f1.add(textFieldForUserID);
        f1.add(jPasswordField);
        f1.add(labelWelcome);
        f1.add(buttonLogin);
        f1.add(buttonCancel);

        //Property of Labels.
        labelWelcome.setBounds(110, 45, 180, 30);
        labelWelcome.setBackground(Color.RED);
        labelWelcome.setForeground(Color.WHITE);
        labelUserID.setBounds(80, 80, 60, 50);
        labelUserID.setBackground(Color.BLACK);
        labelUserID.setForeground(Color.YELLOW);
        labelPassword.setBounds(80, 120, 80,  50);
        labelPassword.setBackground(Color.BLACK);
        labelPassword.setForeground(Color.YELLOW);
        textFieldForUserID.setBounds(150, 95, 150, 20);
        textFieldForUserID.setForeground(Color.RED);
        jPasswordField.setBounds(165, 135, 150, 20);
        jPasswordField.setForeground(Color.RED);
        buttonLogin.setBounds(140, 175, 50, 20);
        buttonLogin.setBackground(Color.YELLOW);
        buttonCancel.setBounds(230, 175, 50, 20);
        buttonCancel.setBackground(Color.YELLOW);

        //Property of Frame1.
        f1.setVisible(true);
        f1.setLayout(null);
        f1.setBounds(1450, 450, 400, 220);
        f1.setTitle("RitikCoder's GUI Login");
        f1.setBackground(Color.BLACK);
        setForeground(Color.YELLOW);
        f1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f1.dispose();
            }
        });

    }
}

public class GUI_1UsingAWT_API {
    public static void main(String[] args) {
    GUI_Login gui_login= new GUI_Login();

    }
}