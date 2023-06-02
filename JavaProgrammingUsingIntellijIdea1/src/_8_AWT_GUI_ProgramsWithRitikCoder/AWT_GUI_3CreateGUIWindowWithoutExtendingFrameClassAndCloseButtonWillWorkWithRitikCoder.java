package _8_AWT_GUI_ProgramsWithRitikCoder;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWT_GUI_3CreateGUIWindowWithoutExtendingFrameClassAndCloseButtonWillWorkWithRitikCoder {
    public AWT_GUI_3CreateGUIWindowWithoutExtendingFrameClassAndCloseButtonWillWorkWithRitikCoder() {
        Frame frame2= new Frame("AWT GUI Window 3");//Reference creation of Frame class.

        //We should always code other codes upper side of Frame properties. like button, label and show on.


        //Properties of Frame Class.
        frame2.setSize(300, 200);
        frame2.setVisible(true);
        frame2.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame2.dispose();
            }
        });

    }

    public static void main(String[] args) {
        new AWT_GUI_3CreateGUIWindowWithoutExtendingFrameClassAndCloseButtonWillWorkWithRitikCoder();
    }
}
