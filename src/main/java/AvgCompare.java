import java.util.ArrayList;

public class AvgCompare {
    public static Integer avgCompare(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        int avgNumArr1 = Average.average(arr1);
        int avgNumArr2 = Average.average(arr2);
        if (avgNumArr1 > avgNumArr2) {
            return 1;
        } else if (avgNumArr1 == avgNumArr2) {
            return 2;
        } else {
            return 3;
        }
    }
}
