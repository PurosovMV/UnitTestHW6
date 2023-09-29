import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class AvgCompareTest {

    @Test
    void AvgCompareReturn1() {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr1.add(100);
            arr1.add(200);
            arr1.add(300);
            arr1.add(400);
            arr1.add(500);
        }
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr2.add(600);
            arr2.add(700);
            arr2.add(800);
            arr2.add(900);
            arr2.add(950);
        }
        assertThat(AvgCompare.avgCompare(arr1, arr2)).isEqualTo(3);
    }

    @Test
    void AvgCompareReturn2() {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr1.add(100);
            arr1.add(200);
            arr1.add(300);
            arr1.add(400);
            arr1.add(500);
        }
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr2.add(100);
            arr2.add(200);
            arr2.add(300);
            arr2.add(400);
            arr2.add(500);
        }
        assertThat(AvgCompare.avgCompare(arr1, arr2)).isEqualTo(2);
    }

    @Test
    void AvgCompareReturn3() {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr1.add(600);
            arr1.add(700);
            arr1.add(800);
            arr1.add(900);
            arr1.add(950);
        }
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr2.add(100);
            arr2.add(200);
            arr2.add(300);
            arr2.add(400);
            arr2.add(500);
        }
        assertThat(AvgCompare.avgCompare(arr1, arr2)).isEqualTo(1);
    }
}