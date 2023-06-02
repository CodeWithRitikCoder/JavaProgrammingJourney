package _8_AWT_GUI_ProgramsWithRitikCoder;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWT_GUI_2CreateGUIWindowWithoutExtendingFrameClassWithRitikCoder {
    public AWT_GUI_2CreateGUIWindowWithoutExtendingFrameClassWithRitikCoder() {
        Frame frame= new Frame("AWT GUI Window 2");
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
//        new AWT_GUI_2CreateGUIWindowWithoutExtendingFrameClassWithRitikCoder();
        AWT_GUI_2CreateGUIWindowWithoutExtendingFrameClassWithRitikCoder Obj1= new AWT_GUI_2CreateGUIWindowWithoutExtendingFrameClassWithRitikCoder();
    }
}
