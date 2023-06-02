package _4_com.RitikCoder;
interface GPSInterface{
    void methodGPS();
}
interface CameraInterface{
    void methodCamera();
}
interface MediaPlayerInterface{
    void methodMediaPlayer();
}
class BasicPhoneClass{
    void callMethod(){
        System.out.println("Calling");
    }
    void messageMethod(){
        System.out.println("Messaging");
    }
}
class SmartPhoneClass extends BasicPhoneClass implements GPSInterface, CameraInterface, MediaPlayerInterface{
    @Override
    public void methodGPS() {
        System.out.println("Use GPS");
    }
    @Override
    public void methodCamera() {
        System.out.println("Use Camera");
    }
    @Override
    public void methodMediaPlayer() {
        System.out.println("Use Player");
    }
}
public class PolymorphismUsingSmartPhoneAnatomy {
    public static void main(String[] args) {
        System.out.println("Here I'm using Polymorphism using Smart phone anatomy");
//        SmartPhoneClass smartPhoneClass= new SmartPhoneClass();
//        smartPhoneClass.callMethod();
//        smartPhoneClass.messageMethod();
//        smartPhoneClass.methodGPS();
//        smartPhoneClass.methodCamera();
//        smartPhoneClass.methodMediaPlayer();

//        GPSInterface gpsInterface= new SmartPhoneClass();
//        gpsInterface.methodGPS();

//        CameraInterface cameraInterface= new SmartPhoneClass();
//        cameraInterface.methodCamera();
        MediaPlayerInterface mediaPlayerInterface= new SmartPhoneClass();
        mediaPlayerInterface.methodMediaPlayer();
    }
}
