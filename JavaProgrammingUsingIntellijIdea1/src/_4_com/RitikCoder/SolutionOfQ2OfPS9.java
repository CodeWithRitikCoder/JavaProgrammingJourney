package _4_com.RitikCoder;

public class SolutionOfQ2OfPS9 {
        private int radius;
        private int height;

        public int getVolumeOfCylinder() {return (int)(3.144* radius* radius* height); }
        public void setRadius(int radius) {this.radius = radius; }
        public int getSurfaceAreaOfCylinder() {
            return (int) (2* (3.144* radius* radius* height)+ 2* (3.144* radius* radius));
        }
        public void setHeight(int height) {this.height = height; }

    public static void main(String[] args) {
        System.out.println("Solution Of Q-2 Of PS-9");
        SolutionOfQ2OfPS9 solutionOfQ2OfPS9= new SolutionOfQ2OfPS9();
        solutionOfQ2OfPS9.setRadius(12);
        solutionOfQ2OfPS9.setHeight(16);
        System.out.println("The surface area of a cylinder is : "+ solutionOfQ2OfPS9.getSurfaceAreaOfCylinder());
        System.out.println("The volume of a cylinder is : "+ solutionOfQ2OfPS9.getVolumeOfCylinder());
    }
}
