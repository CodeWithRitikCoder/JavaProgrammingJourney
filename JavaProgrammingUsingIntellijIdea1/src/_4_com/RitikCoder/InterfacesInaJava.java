package _4_com.RitikCoder;
interface AA{
    void add(int a, int b);
}
class Addition implements AA{
    public void add(int a, int b){
        System.out.println("The addition is : "+ (a+ b));
    }
}
public class InterfacesInaJava {
    public static void main(String[] args) {
        System.out.println("Here I'm using interface in java.");
        Addition addition= new Addition();
        addition.add(3, 4);

    }
}
