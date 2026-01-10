package patterns;

public class Pattern10_HalfDiamondStarPattern {

    public static void main(String[] args) {

        // let's divide the problem in two halfs

        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // first half is printed let's print the second half

        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
