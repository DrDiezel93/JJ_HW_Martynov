package HomeWork1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW1 {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1, 2, 8, 4, 2, 5, 7, 6);
//        List<Integer> lst2 = new ArrayList<>();
        double averageLst = getAverage(lst);
        System.out.println(averageLst);
    }

    private static double getAverage(List<Integer> list) {
        return list.stream()
                .filter(a -> a % 2 == 0)
                .mapToInt(a -> a)
                .average().orElse(0); // возвращает ноль, если список пуст
    }
}
