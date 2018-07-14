package DiamondExercises;

public class FizzBuzz {
    private static void FizzBuzz() {
        int begin = 1, end = 100;
        for (int i = begin; i <= end; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            } else if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            } else if (i % 3 != 0 && i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println("FizzBuzz");
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzz.FizzBuzz();
    }
}
