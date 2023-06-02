//Create a class TV which implements TVRemote interface from Question no- 6.
package _4_com.RitikCoder;
interface TVRemote1{
    void changeChannel();
    void increaseVolume();
    void decreaseVolume();
}
class TV implements TVRemote{
    @Override
    public void changeChannel() {
        System.out.println("Channel is Changing");
    }
    @Override
    public void increaseVolume() {
        System.out.println("Volume is increasing");
    }
    @Override
    public void decreaseVolume() {
        System.out.println("Volume is decreasing");
    }
}
public class SolutionOfQ7OfPS11 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q-7 Of PS-11");
        TV tv= new TV();
        tv.changeChannel();
        tv.increaseVolume();
        tv.decreaseVolume();
    }
}
