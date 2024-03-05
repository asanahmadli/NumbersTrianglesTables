package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder b = new StringBuilder();
        for (int i = 1; i <= 5; i++) {

            if (i == 1) {
                for (int a = i; a <= 5; a++) {
                    b.append("  " + a + " ").append("|");
                }
                b.append("\n");
            } else if (i == 2) {
                for (int a = i; a <= 10; a += 2) {
                    if (a == 10) {
                        b.append(" " + a + " ").append("|");
                    } else {
                        b.append("  " + a + " ").append("|");
                    }
                }
                b.append("\n");
            } else if (i == 3) {
                for (int a = i; a <= 15; a += 3) {
                    if (a >= 10) {
                        b.append(" " + a + " ").append("|");
                    } else {
                        b.append("  " + a + " ").append("|");
                    }
                }
                b.append("\n");
            } else if (i == 4) {
                for (int a = i; a <= 20; a += 4) {
                    if (a >= 10) {
                        b.append(" " + a + " ").append("|");
                    } else {
                        b.append("  " + a + " ").append("|");
                    }
                }
                b.append("\n");
            } else {
                for (int a = 5; a <= 25; a += 5) {
                    if (a >= 10) {
                        b.append(" " + a + " ").append("|");
                    } else {
                        b.append("  " + a + " ").append("|");
                    }
                }
                b.append("\n");
            }
        }

        return b.toString();
    }

    public static String getLargeMultiplicationTable() {


        StringBuilder b = new StringBuilder();

        for (int i = 1; i <= 10; i++) {

            for (int m = 1; m <= 10; m++) {
                int number = m * i;
                if (number >= 10 && number < 100) {
                    b.append(" " + i * m + " ").append("|");
                } else if (number >= 100) {
                    b.append(i * m + " ").append("|");
                } else if (number < 10) {
                    b.append("  " + i * m + " ").append("|");
                }
            }
            b.append("\n");

        }
        return b.toString();

    }

    public static String getMultiplicationTable(int tableSize) {

        StringBuilder b = new StringBuilder();

        for (int i = 1; i <= tableSize; i++) {

            for (int m = 1; m <= 20; m++) {
                int number = m * i;
                if (number >= 10 && number < 100) {
                    b.append(" " + i * m + " ").append("|");
                } else if (number >= 100) {
                    b.append(i * m + " ").append("|");
                } else if (number < 10) {
                    b.append("  " + i * m + " ").append("|");
                }
            }
            b.append("\n");

        }
        return b.toString();

    }
}

