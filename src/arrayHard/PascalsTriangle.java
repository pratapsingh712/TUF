package arrayHard;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();

        result = generatePascalsTriangle(5);

        System.out.println(result);
    }

    private static List<List<Integer>> generatePascalsTriangle(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        if(numRows==1){
            list.add(1);
            result.add(list);
            return result;
        }

        List<List<Integer>> out = generatePascalsTriangle(numRows-1);
        List<Integer> le = out.get(out.size()-1);
        list.add(1);

        for(int i=0;i<le.size()-1;i++){
            list.add(le.get(i)+le.get(i+1));
        }
        list.add(1);

        out.add(list);

        return out;
    }
}
