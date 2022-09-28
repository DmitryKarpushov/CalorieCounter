package org.example.convert;

/**
 * @author Дмитрий Карпушов 28.09.2022
 */
public class Converter {
    private static final double STEP = 0.00075;
    private static final int CALORIE_STEP = 50;

    public static double convertKM(int sumSteps) {
        return STEP * sumSteps;
    }

    public static double convertCL(int sumSteps) {
        return sumSteps / CALORIE_STEP;
    }
}
