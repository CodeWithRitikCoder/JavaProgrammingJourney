package _8_AWT_GUI_ProgramsWithRitikCoder;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWT_GUI_1CreateGUIWindowByUsingExtendingFrameClassWithRitikCoder extends Frame{
    public AWT_GUI_1CreateGUIWindowByUsingExtendingFrameClassWithRitikCoder(){
        setSize(300, 200);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new AWT_GUI_1CreateGUIWindowByUsingExtendingFrameClassWithRitikCoder();
    }
}
