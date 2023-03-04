package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder str1 = new StringBuilder();
        String firstStar = "*";
        for (int j = 1; j < numberOfRows; j = j + 1) {
            str1.append(firstStar.repeat(j)+"\n");

        }
        return str1.toString();
    }

    public static String getRow(int numberOfStars) {
        String row = "";
        for (int i = 0; i < numberOfStars; i++){
            row += "*";
        }
        return row;
    }

    public static String getSmallTriangle() {
            StringBuilder str1 = new StringBuilder();
            String firstStar = "*";
            for (int j = 1; j <= 4; j = j + 1) {
                str1.append(firstStar.repeat(j)+"\n");

            }
            return str1.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder str1 = new StringBuilder();
        String firstStar = "*";
        for (int j = 1; j < 10; j = j + 1) {
            str1.append(firstStar.repeat(j)+"\n");

        }
        return str1.toString();
    }
}
