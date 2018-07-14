package DiamondExercises;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    private static List<Integer> generate(int n) {
        List<Integer> result = new ArrayList<>();
        int copy = n;
        for (int i = 2; i <= n; i++) {
            if (copy % i == 0) {
                result.add(i);
                copy /= i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> thrity = generate(30);
        thrity.forEach(System.out::println);
    }
}
