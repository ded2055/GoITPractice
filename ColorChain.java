package goit.task4_1;


public class ColorChain {
    int whiteStripeLength = 1;
    int yellowStripeLength = 2;
    int redStripeLength = 3;

    public int count(int N) {
        int[] stripesQuantity = new int[N+1];

        if (N == whiteStripeLength) return 1;
        if (N == yellowStripeLength) return 2;
        if (N == redStripeLength) return 4;

        stripesQuantity[0] = 0;
        stripesQuantity[1] = 1;
        stripesQuantity[2] = 2;
        stripesQuantity[3] = 4;

        for (int i = 4; i < N+1; i++) {
            stripesQuantity[i] = stripesQuantity[i-whiteStripeLength] +
                    stripesQuantity[i-yellowStripeLength] +
                    stripesQuantity[i-redStripeLength];
        }

        return stripesQuantity[N];
    }
}
