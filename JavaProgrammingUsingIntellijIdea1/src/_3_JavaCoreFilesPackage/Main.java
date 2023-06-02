package _3_JavaCoreFilesPackage;
//importing statements is here.
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    JFrame jFrame1;
    JLabel jLabelForWelcome, jLabelForCountWords, jLabelForCountLetters;
    JTextArea jTextAreaForSmallNotepad;
    JButton jButtonForCountWordsAndLetters;
    public Main() {
        jFrame1= new JFrame("RitikCoder's TextArea");

        //other things is created here.
        jLabelForWelcome= new JLabel("Welcome to RitiKCoder's Small Notepad");
        jLabelForWelcome.setBounds(75, 10, 250, 30);
        jTextAreaForSmallNotepad= new JTextArea();
        jTextAreaForSmallNotepad.setBounds(30, 50, 320, 200);
        jLabelForCountWords= new JLabel("Words :- ");
        jLabelForCountWords.setBounds(35, 250, 80, 20);
        jLabelForCountLetters= new JLabel("Letters :- ");
        jLabelForCountLetters.setBounds(250, 250, 80, 20);
        jButtonForCountWordsAndLetters= new JButton("Click me");
        jButtonForCountWordsAndLetters.setBounds(130, 275, 100, 30);

        //Adding of created things into the frame is here.
        jFrame1.add(jLabelForWelcome);
        jFrame1.add(jTextAreaForSmallNotepad);
        jFrame1.add(jLabelForCountWords);
        jFrame1.add(jLabelForCountLetters);
        jFrame1.add(jButtonForCountWordsAndLetters);

        //functionality of created things
        jButtonForCountWordsAndLetters.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str= jTextAreaForSmallNotepad.getText();
                jLabelForCountLetters.setText("Letters :- "+ str.length());
                String []stringForCountWords= str.split(" ");
                jLabelForCountWords.setText("Words :- "+ stringForCountWords.length);
            }
        });


        //Properties of JFrame.
        jFrame1.setLayout(null);
        jFrame1.setSize(400, 350);
        jFrame1.setLocation(1400, 100);
        jFrame1.setResizable(false);
        jFrame1.setVisible(true);
        jFrame1.setDefaultCloseOperation(jFrame1.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        Main main= new Main();
    }
}