//Create a class Monkey with jump() and bite() methods create a class Human with speak() method  which inherits this monkey
// class and implements BasicAnimal interface with eat() and sleep() methods and run.
package _4_com.RitikCoder;
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
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
public class SolutionOfQ3OfPS11 {
    public static void main(String[] args) {
        System.out.println("Solution Of Q-3 Of PS-11");
        Human human= new Human();
        human.jump();
        human.bite();
        human.speak();
        human.eat();
        human.sleep();
    }
}
