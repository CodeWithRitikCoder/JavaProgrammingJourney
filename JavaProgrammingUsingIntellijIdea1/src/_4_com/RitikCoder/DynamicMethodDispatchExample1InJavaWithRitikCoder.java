//Use of Dynamic Method Dispatch in java With RitikCoder.
package _4_com.RitikCoder;

class Phone{
    public void on(){
        System.out.println("Please turn on the Phone.");
    }
    public void showTime(){
        System.out.println("Time is 12:00 AM.");
    }
}

class SmartPhone extends Phone {
    public void on(){
        System.out.println("Please Turn on the SmartPhone.");
    }
    public void music(){
        System.out.println("Play the music.");
    }
}
public class DynamicMethodDispatchExample1InJavaWithRitikCoder {
    public static void main(String[] args) {
        System.out.println("Example 1 of Dynamic method Dispatch in java With RitikCoder.");

        Phone phone= new SmartPhone(); //this is called Dynamic method dispatch in java.
        phone.showTime();
        phone.on();
//        phone.music(); //This is not allowed in the java.

    }
}
