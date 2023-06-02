package _8_AWT_GUI_ProgramsWithRitikCoder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GUI_UsingFrameAndWindowListenerToWishHello extends Frame implements WindowListener {

    Label labelForWishHELLO= new Label(" HELLO RitikCoder ");
    Scrollbar scrollbarVertical= new Scrollbar();
    JComboBox jComboBox= new JComboBox();
    JRadioButton jRadioButton= new JRadioButton();
    JCheckBox jCheckBox= new JCheckBox();


    //Constructor is here.
    GUI_UsingFrameAndWindowListenerToWishHello(){
        this.setVisible(true);
        this.setBounds(1450, 450, 400, 300);
        this.setLayout(null);
        this.setTitle("RitikCoder's WindowListener");
        this.setBackground(Color.BLACK);

        //adding of window Frame.
        this.addWindowListener(this);
        this.add(labelForWishHELLO);
        this.add(scrollbarVertical);
        this.add(jComboBox);
        this.add(jRadioButton);
        this.add(jCheckBox);

        //Property of created things.
        labelForWishHELLO.setBounds(150, 100, 200 ,50);
        labelForWishHELLO.setForeground(Color.YELLOW);
        scrollbarVertical.setBounds(380, 20, 10, 300);
        scrollbarVertical.setBackground(Color.YELLOW);
        scrollbarVertical.setForeground(Color.BLUE);
        jComboBox.addItem("Instagram");
        jComboBox.addItem("Youtube");
        jComboBox.addItem("Fackbook");
        jComboBox.addItem("Twitter");
        jComboBox.addItem("Telegram");
        jComboBox.addItem("Whatsapp");
        jComboBox.setBounds(180, 150, 110, 20);
        jComboBox.setBackground(Color.YELLOW);
        jRadioButton.setBounds(120, 180, 20, 15);
        jRadioButton.setBackground(Color.BLACK);
        jCheckBox.setBounds(140, 180, 20, 15);
        jCheckBox.setBackground(Color.BLACK);

    }
    //Main method is here.
    public static void main(String[] args) {
        GUI_UsingFrameAndWindowListenerToWishHello gufawltwh= new GUI_UsingFrameAndWindowListenerToWishHello();
    }
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window is opened");
    }
    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
        System.exit(0);
    }
    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }
    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified");
    }
    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified");
    }
    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }
    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }
}