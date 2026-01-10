package patterns;

public class Pattern21_HollowRectangle {
    public static void main(String[] args) {

        // hollow rectangle is a pattern where print all the boarder as star and i==0,j==0,i=n-1,j=n-1 as star otherwise spaces
        int n = 20;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
