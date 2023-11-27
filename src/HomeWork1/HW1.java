package HomeWork1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW1 {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1, 5, 9, 3, 2, 5, 7, 6);
//        List<Integer> lst2 = new ArrayList<>();
        double averageLst = getAverage(lst);
        System.out.println(averageLst);
    }

    private static double getAverage(List<Integer> list) {
        return list.stream()
                .mapToInt(a -> a)
                .average().orElse(0); // возвращает ноль, если список пуст
    }
}
