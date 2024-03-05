package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();
        for(int i=start;i<stop;i++){
            if(i%2==0){
                sb.append(i);
            }
        }
        return sb.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();
        for(int i=start;i<stop;i++){
            if(i%2!=0){
                sb.append(i);
            }
        }
        return sb.toString();

    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder sb = new StringBuilder();
        int square = 1;
        for(int i=start;i<stop;i+=step){
            square = i*i;
            sb.append(square);
        }
        return sb.toString();

    }

    public static String getRange(int stop) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<stop;i++){
            sb.append(i);
        }
        return sb.toString();
    }

    public static String getRange(int start, int stop) {
        StringBuilder sb = new StringBuilder();
        for(int i=start;i<stop;i++){
            sb.append(i);
        }
        return sb.toString();
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder sb = new StringBuilder();
        for(int i=start;i<stop;i+=step){
            sb.append(i);
        }

        return sb.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder sb = new StringBuilder();
        int a = 1;
        for(int i=start;i<stop;i+=step){
            for(int m=1;m<=exponent;m++){
                a=i*i;
            }
            sb.append(a);
        }
        return sb.toString();
    }
}
