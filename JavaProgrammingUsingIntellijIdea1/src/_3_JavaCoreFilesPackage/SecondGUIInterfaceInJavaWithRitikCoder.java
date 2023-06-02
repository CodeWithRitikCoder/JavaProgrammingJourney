package _3_JavaCoreFilesPackage;//Code a software to create My Second GUI interface in Java with RitikCoder.

//importing statements.
import javax.swing.*;

class MainFrame extends JFrame{
    public void initialize(){
        setTitle("Welcome to RitikCoder's GUI");
        setSize(450, 300);
        setBounds(1400, 500, 450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }
}

public class SecondGUIInterfaceInJavaWithRitikCoder {
    public static void main(String[] args) {
        System.out.println("This is my Second GUI Interface in Java.");
        MainFrame myFrame= new MainFrame();
        myFrame.initialize();
    }
}
