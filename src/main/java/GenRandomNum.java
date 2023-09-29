import java.util.ArrayList;
import java.util.Random;

public class GenRandomNum {

    private static final Random random = new Random();

    public static ArrayList<Integer> randomArray() {
        ArrayList<Integer> randomArray = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            randomArray.add(random.nextInt(1000));

        }
        return randomArray;
    }
}
