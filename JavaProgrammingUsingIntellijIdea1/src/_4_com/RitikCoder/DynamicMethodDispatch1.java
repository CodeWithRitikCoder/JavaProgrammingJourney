package _4_com.RitikCoder;
class Phone1{
    public void showTime(){
        System.out.println("It's 8 O'Clock");
    }
    public void phoneOn(){
        System.out.println("Phone is Turning on");
    }
}
class SmartPhone1 extends Phone1{
    public void phoneOn(){
        System.out.println("SmartPhone is Turning on.");
    }
    public void playMusic(){
        System.out.println("Music is Playing in SmartPhone");
    }
}
public class DynamicMethodDispatch1 {
    public static void main(String[] args) {
        System.out.println("Here I'm using Dynamic method dispatch in java.");
        Phone1 phone1= new SmartPhone1();
        phone1.phoneOn();
        //phone1.playMusic();//This is not Allowed
        phone1.showTime();

    }
}
