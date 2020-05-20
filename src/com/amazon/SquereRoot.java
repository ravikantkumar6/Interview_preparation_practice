package com.amazon;

public class SquereRoot {

    static void squereRoot(double n) {
        double i = 1;
        boolean found = false;
        while (!found) {
            if (i * i == n) {
                System.out.println(i);
                found = true;
            } else if (i * i > n) {
                double result = Squere(n, i - 1, i);
                System.out.printf("%.5f", result);
                found = true;
            }
            i++;
        }
    }

    private static double Squere(double n, double d, double i) {
        double mid = (d + i) / 2;
        double mul = mid * mid;
        if ((mul == n) || (Math.abs(mul - n) < 0.00001))
            return mid;
        else if (mul < n)
            return Squere(n, mid, i);
        else if (mul > n)
            return Squere(n, d, mid);
        return 0;
    }

}
