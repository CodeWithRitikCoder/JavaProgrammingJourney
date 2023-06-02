package _4_com.RitikCoder;

class Pubg{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}
public class SolutionOfQ5OfPS8 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q-5 Of PS-8");
        Pubg player1= new Pubg();
        player1.run();
        player1.hit();
        player1.fire();

    }
}
