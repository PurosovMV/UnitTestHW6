
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class AverageTest {
    @Test //Тестирование метода нахождения среднего значения в списке
    void Average() {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(10);
            arr.add(20);
            arr.add(30);
            arr.add(40);
            arr.add(50);
        }
        assertThat(Average.average(arr)).isEqualTo(30);
    }
}