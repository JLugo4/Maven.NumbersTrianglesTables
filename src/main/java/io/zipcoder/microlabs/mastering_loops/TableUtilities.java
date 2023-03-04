package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String numTable = "";
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                numTable = numTable + String.format("%5s", i * j + " |");
            }
            numTable = numTable + "\n";
        }
        return numTable;
    }

    public static String getLargeMultiplicationTable() {
        String numTable = "";
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                numTable = numTable + String.format("%5s", i * j + " |");
            }
            numTable = numTable + "\n";
        }
        return numTable;
    }

    public static String getMultiplicationTable(int tableSize) {
        String numTable = "";
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                numTable = numTable + String.format("%5s", i * j + " |");
            }
            numTable = numTable + "\n";
        }
        return numTable;
    }
}