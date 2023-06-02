package _4_com.RitikCoder;

public class SolutionOfQ4OfPS9 {
    private int length, breath;
    public SolutionOfQ4OfPS9() {
        length = 5;
        breath = 4;
    }
    public SolutionOfQ4OfPS9(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }
    public int getLength() {return length; }
    public int getBreath() {return breath; }

    public static void main(String[] args) {
        System.out.println("Solution Of Q-4 Of PS-9");
        SolutionOfQ4OfPS9 solutionOfQ4OfPS9= new SolutionOfQ4OfPS9();
        System.out.println("1st time the length is : "+ solutionOfQ4OfPS9.getLength());
        System.out.println("1st time the breadth is : "+ solutionOfQ4OfPS9.getBreath());
        SolutionOfQ4OfPS9 solutionOfQ4OfPS91= new SolutionOfQ4OfPS9(25, 18);
        System.out.println("2st time the length is : "+ solutionOfQ4OfPS91.getLength());
        System.out.println("2st time the breadth is : "+ solutionOfQ4OfPS91.getBreath());
    }
}
