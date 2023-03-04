package io.zipcoder.microlabs.mastering_loops;


import java.util.ArrayList;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder evenNum = new StringBuilder();
        for(int i = start; i < stop; i++) {
            if(i%2==0) {
                evenNum.append(i);
            }
        }
        return evenNum.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder oddNum = new StringBuilder();
        for(int i = start; i<stop; i++){
            if(i%2!=0){
                oddNum.append(i);
            }
        }
        return oddNum.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder squareList = new StringBuilder();
        for (int i = start; i < stop; i++){
            squareList.append(i * i);
        i = i + step - 1;
    }
        return squareList.toString();
    }

    public static String getRange(int stop) {
        StringBuilder getRange = new StringBuilder();
        for(int i = 0; i<stop; i++){
            getRange.append(i);
        }
        return getRange.toString();
    }

    public static String getRange(int start, int stop) {
        StringBuilder getRange = new StringBuilder();
        for(int i = start; i<stop; i++){
            getRange.append(i);
        }
        return getRange.toString();
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder getRange = new StringBuilder();
        for(int i = start; i < stop; i += step){
            getRange.append(i);
        }
        return getRange.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder getExp = new StringBuilder();
        for(int i = start; i<stop; i++){
            int exp = (int) Math.pow(i*i, exponent);
            getExp.append(exp);
            i = i + step - 1;
        }
        return getExp.toString();
    }
}
