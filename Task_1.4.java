public class FindMaxNumber {
    public int max(int[] input) {
        int max = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[max] <= input[i]) max = i;
        }

        return input[max];
    }
}
