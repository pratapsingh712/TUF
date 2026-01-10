package patterns;

public class AlphaTrianglePattern {
    public static void main(String[] args) {

//        for(char i = 'E'; i>='A'; i--){
////            for(char j = 'E'; j>=i; j--){
////                System.out.print(j+" ");
////            }
//
//            System.out.println();
//        }

        for(int i=0;i<5;i++){
            char ch = (char) ('E'-i);

            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
