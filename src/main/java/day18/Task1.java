package day18;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 12};
        System.out.println(recursionSum(numbers, 0));
    }

    public static int recursionSum(int[] numbers, int i) {
        if (i == numbers.length)
            return 0;
        return numbers[i] + recursionSum(numbers, i + 1);
    }
}
