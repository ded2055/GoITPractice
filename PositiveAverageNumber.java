package goit2_2;

public class PositiveAverageNumber {
    public int average(int a, int b) {
        long aLong = a;
        long bLong = b;

        return (int)Math.abs((aLong+bLong)/2);
    }
}
