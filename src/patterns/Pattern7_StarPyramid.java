package patterns;

public class Pattern7_StarPyramid {

    public static void main(String[] args) {

        // here we need to print star pyramid for which we also need to print spaces

        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                // this for loop is to print the spaces
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
