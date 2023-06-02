//Demonstrate polymorphism using monkey class from Question no- 3.
package _4_com.RitikCoder;
class Monkey1{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal1{
    void eat();
    void sleep();
}
class Human1 extends Monkey implements BasicAnimal1{
    void speak(){
        System.out.println("Hello sir..!");
    }
    @Override
    public void eat() {
        System.out.println("Eating...");
    }
    @Override
    public void sleep() {
        System.out.println("Sleeping...");
    }
}
public class SolutionOfQ5OfPS11 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q-5 Of PS-11");
        Monkey1 monkey1= new Monkey1();
        monkey1.jump();
        monkey1.bite();
    }
}
