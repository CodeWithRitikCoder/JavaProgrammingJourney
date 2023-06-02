package _4_com.RitikCoder;

class A3{
    private int a, b, c, d;

    public String getValue() {
        System.out.println("a :- "+ a+", B :- "+ b+", c :- "+ c+", d :- "+ d);
        return ("Run Successfully");
    }

    public void setValue(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}
public class ThisKeywordExample1InJavaWithRitikCoder {
    public static void main(String[] args) {
        System.out.println("Example 1 of this keyword in Java with RitikCoder.");

        A3 a3= new A3();
        a3.setValue(2,3, 4, 5);
        System.out.println(a3.getValue());
    }
}
