package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder b = new StringBuilder();
        for(int i=1;i<numberOfRows;i++){
            b.append(getRow(i)+"\n");
        }
        return b.toString();
    }


    public static String getRow(int numberOfStars) {
        StringBuilder b = new StringBuilder();
        for(int i=0;i<numberOfStars;i++){
            b.append("*");
        }
        return b.toString();
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
