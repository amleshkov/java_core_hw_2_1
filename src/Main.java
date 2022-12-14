import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> result = new ArrayList<>();

        for (int i : intList) {
            if (i > 0 && i % 2 == 0) {
                result.add(i);
            }
        }
        result.sort(Comparator.naturalOrder());
        for (int i : result) {
            System.out.println(i);
        }
    }
}