package patterns;

public class Pattern1_RectangularStarPattern {
    public static void main(String[] args) {
        // print 5 rows of Rectangular pattern

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
