package datatypes;

import javax.sound.sampled.Line;

public class DataTypeDemo {
    public static void main(String[] args) {

        /* Max and Min Integer value */
        int maxIntValue = Integer.MAX_VALUE;
        int minIntValue = Integer.MIN_VALUE;
        System.out.println("Maximum Integer value : " + maxIntValue);
        System.out.println("Minimum Integer value : " + minIntValue);

        /* Max and Min float value */
        float maxFloatValue = Float.MAX_VALUE;
        float minFloatValue = Float.MIN_VALUE;
        System.out.println("Maximum Float value : " + maxFloatValue);
        System.out.println("Minimum Float value : " + minFloatValue);

        /* Max and Min char value */
        char maxCharValue = Character.MAX_VALUE;
        char minCharValue = Character.MIN_VALUE;
        System.out.println("Max Character value : " + maxCharValue);
        System.out.println("Min Character value : " + minCharValue);

        /* Max and Min double value */
        double maxdoubleValue = Double.MAX_VALUE;
        double mindoubleValue = Double.MIN_VALUE;
        System.out.println("Max Double value : " + maxdoubleValue);
        System.out.println("Min Double value : " + mindoubleValue);

        /* Max and Min long value */
        long maxlongValue = Long.MAX_VALUE;
        long minlongValue = Long.MIN_VALUE;
        System.out.println("Max long value : " + maxlongValue);
        System.out.println("Min long value : " + minlongValue);

       /* int myIntValue = 5;
        float myFloatValue = (float) 5.22; *//*Line gives error because f is not added at the end of the value and by default
                                          and by default java consider's double as float values *//*
                                    *//* also you can typecast it *//*

        double myDoubleValue = 5.25d;*/

        int x = 5 / 3;
        float y = 5.00f / 3.00f;
        double z = 5.00d / 3.00d;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        double pounds = 200d;
        double poundsToKilograms = pounds * 0.453592;
        System.out.println(poundsToKilograms);

    }
}
