//Use the Pen class from Question no- 1 to create a concrete class fountain Pen with additional method changeNib() and run.
package _4_com.RitikCoder;
abstract class Pen1{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen1{
    @Override
    void write() {
        System.out.println("Writing");
    }
    @Override
    void refill() {
        System.out.println("Refilling");
    }
    void changeNib(){
        System.out.println("Changing the Nib");
    }
}
public class SolutionOfQ2OfPS11 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q-2 Of PS-11");
        FountainPen fountainPen= new FountainPen();
        fountainPen.write();
        fountainPen.refill();
        fountainPen.changeNib();
    }
}
