import java.util.ArrayList;

public class Average {
    public static int average(ArrayList<Integer> arr) {
        int avg = 0;
        for (int i : arr) {
            avg += i;
        }
        return avg/ arr.size();
    }
}
