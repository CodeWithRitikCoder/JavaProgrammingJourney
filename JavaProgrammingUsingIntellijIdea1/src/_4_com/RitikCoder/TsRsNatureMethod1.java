package _4_com.RitikCoder;

public class TsRsNatureMethod1 {
    int method1(int a, int b){
        int x, y;
        x= a;
        y= b;
        if(x> y){
            return  (x);
        }else if(y> x){
            return  (y);
        }else{
            return  (0);
        }
    }
    public static void main(String[] args) {
        System.out.println("Ts - Rs Nature Method");
        TsRsNatureMethod1 tsRsNatureMethod1= new TsRsNatureMethod1();
        System.out.println("Answer is : "+ tsRsNatureMethod1.method1(5, 5));

    }
}
