import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 0 && numbers.get(i) % 2 == 0) {
                positiveNumbers.add(numbers.get(i));
            }
        }
        Collections.sort(positiveNumbers);
        System.out.println(positiveNumbers);


    }
}
