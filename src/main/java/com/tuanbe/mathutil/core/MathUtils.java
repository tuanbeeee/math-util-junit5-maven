package com.tuanbe.mathutil.core;

/**
 *
 * @author Tranduc
 */
public class MathUtils {

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("nmust be between 0..20");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * getFactorial(n - 1);// đệ quy !!!
    }
}
