package day18;

import java.util.Collections;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(7175897)); // 5
    }

    public static int count7(int k) {
        if (k == 0) {
            return 0;
        }
        if (k % 10 == 7) {
            return 1 + count7(k / 10);
        } else
            return count7(k / 10);
    }
}




