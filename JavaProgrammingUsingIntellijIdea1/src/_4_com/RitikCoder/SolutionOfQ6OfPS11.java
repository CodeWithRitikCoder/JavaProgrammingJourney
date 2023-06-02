//Create an interface TVRemote and use it to inherit another interface SmartTVRemote.
package _4_com.RitikCoder;
interface TVRemote{
    void changeChannel();
    void increaseVolume();
    void decreaseVolume();
}
interface SmartTVRemote extends TVRemote{
    void playGames();
    void changeColors();
}
public class SolutionOfQ6OfPS11 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q-6 Of PS-11");

    }
}
