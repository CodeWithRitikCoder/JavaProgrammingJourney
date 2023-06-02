package _4_com.RitikCoder;
class CellPhone{
    void ringing(){
        System.out.println("I'm Ringin....");
    }
    void vibrating(){
        System.out.println("I'm Vibrating....");
    }
    void callFriend(){
        System.out.println("Calling with My Friend Shruti....");
    }
}
public class SolutionOfQ2OfPS8 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q-2 Of PS-8");
        CellPhone oppoReno8Pro= new CellPhone();
        oppoReno8Pro.ringing();
        oppoReno8Pro.vibrating();
        oppoReno8Pro.callFriend();

    }
}
