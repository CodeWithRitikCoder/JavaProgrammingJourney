//Create a class TelePhone with ring(), lift() and disconnect() methods as abstract methods
//create another class SmartPhone and demonstrate Polymorphism.
package _4_com.RitikCoder;
abstract class TelPhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartPhoneClass1 extends TelPhone{
    @Override
    void ring() {
        System.out.println("Ringing...");
    }
    @Override
    void lift() {
        System.out.println("Lifting...");
    }
    @Override
    void disconnect() {
        System.out.println("disconnecting...");
    }
    void playMusic(){
        System.out.println("Music Playing...");
    }
}
public class SolutionOfQ4OfPS11 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q-4 Of PS-11");
        TelPhone telPhone= new SmartPhoneClass1();
        telPhone.ring();
        telPhone.lift();
        telPhone.disconnect();
    }
}
