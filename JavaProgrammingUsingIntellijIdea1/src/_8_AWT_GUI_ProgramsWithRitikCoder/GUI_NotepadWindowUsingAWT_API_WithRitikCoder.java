package _8_AWT_GUI_ProgramsWithRitikCoder;

//importing things is here.
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Other Classes is here.
class GUI_OfNotepad extends Frame{
    GUI_OfNotepad(){
        Frame frame1= new Frame("RitikCoder's Notepad");

        //Creating of other things like buttons, label and textFields and show on...
        Label labelForFileMenu= new Label("File");
        Label labelForEditMenu= new Label("Edit");
        Label labelForViewMenu= new Label("View");
        TextArea textAreaForNotepad= new TextArea();

        //Properties of created other things.
        labelForFileMenu.setBounds(22, 40, 22 ,10);
        labelForFileMenu.setBackground(Color.WHITE);
        labelForFileMenu.setForeground(Color.BLACK);
        labelForEditMenu.setBounds(60, 40, 23, 10);
        labelForEditMenu.setBackground(Color.WHITE);
        labelForEditMenu.setForeground(Color.BLACK);
        labelForViewMenu.setBounds(97, 40, 30, 10);
        labelForViewMenu.setBackground(Color.WHITE);
        labelForViewMenu.setForeground(Color.BLACK);
        textAreaForNotepad.setBounds(0, 0, 50, 50);
        textAreaForNotepad.setBackground(Color.WHITE);


        //adding of created other things.
        frame1.add(labelForFileMenu);
        frame1.add(labelForEditMenu);
        frame1.add(labelForViewMenu);
        frame1.add(textAreaForNotepad);

        //Frame properties is here.
        frame1.setVisible(true);
        frame1.setSize(500, 400);
        frame1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame1.dispose();
            }
        });
        frame1.setBounds(1370, 440, 500, 400);
        frame1.setBackground(Color.BLACK);
    }
}

public class GUI_NotepadWindowUsingAWT_API_WithRitikCoder {
    public static void main(String[] args) {
        new GUI_OfNotepad();
    }
}
