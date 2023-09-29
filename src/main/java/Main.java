import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = GenRandomNum.randomArray();
        ArrayList<Integer> arr2 = GenRandomNum.randomArray();
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println("Среднее значение первого списка: " + Average.average(arr1));
        System.out.println("Среднее значение второго списка: " + Average.average(arr2));
        switch (AvgCompare.avgCompare(arr1, arr2)) {
            case (1): {
                System.out.println("Среднее значение первого списка больше второго.");
                break;
            }

            case (2): {
                System.out.println("Средние значения списков равны.");
                break;
            }
            case (3): {
                System.out.println("Среднее значение второго списка больше первого.");
                break;
            }
            default: {
                System.out.println("Что-то пошло не так...");
                break;
            }
        }


    }
}
