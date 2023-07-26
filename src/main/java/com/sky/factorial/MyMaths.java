package com.sky.factorial;

public class MyMaths {

    public static int findFactorial(int input){
        double numerator = (double) input;
        double divisor = 2.00;

        while (numerator > 1){
            numerator /= divisor;
            divisor++;
        }

        if (numerator == 1.00) {
            int factorialNum = (int) divisor - 1;
            return factorialNum;
        }

        return 0;
    }

    public static String verboseFindFactorial(int input){
        int result = findFactorial(input);
        return result > 0 ? String.valueOf(result) : "NONE";
    }
}
