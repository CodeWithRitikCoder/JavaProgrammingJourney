package _3_JavaCoreFilesPackage;

//Code a software to using Thread in Java with RitikCoder.
class A implements Runnable{
    @Override
    public void run() {
        for(int i= 1; i<= 5; i++){
            System.out.println("Thread of Class A = "+ i);
        }
    }
}
class B implements Runnable{
    public void run(){
        for(int j= 1; j<= 5; j++){
            System.out.println("Thread of Class B = "+ j);
        }
    }
}
class C implements Runnable{
    @Override
    public void run() {
        for(int k= 1; k<= 5; k++){
            System.out.println("THread of Class C = "+ k);
        }
    }
}
public class ThreadExample1InJavaWithRitikCoder {
    public static void main(String [] arguments){
        Thread t1= new Thread(new A());
        Thread t2= new Thread(new B());
        Thread t3= new Thread(new C());
        t1.start();
        t2.start();
        t3.start();
    }
}
