import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class GenRandomNumTest {

    @Test //Тестирование метода генерирования элементов массива
    void averageListGen() {
        ArrayList<Integer> list = GenRandomNum.randomArray();
        assertThat(list).isNotNull();
    }
}