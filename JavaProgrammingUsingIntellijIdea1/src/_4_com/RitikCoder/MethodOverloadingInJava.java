package _4_com.RitikCoder;
class Super1{
    int sum(int a, int b){
        return(a+ b);
    }
    int sum(int a, int b, int c){
        return(a+ b+ c);
    }
}
public class MethodOverloadingInJava {
    public static void main(String[] args) {
        System.out.println("Here I'm using Method overloading in java.");
        Super1 super1= new Super1();
        System.out.println("The sum of 5, 4 is : "+ super1.sum(5, 4));
        System.out.println("The sum of 5, 4, 8 is : "+ super1.sum(5, 4, 8));

    }
}


