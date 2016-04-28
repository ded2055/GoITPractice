public class FirstOddNumber {
    public int find(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int half = input[i] / 2;
            if (Math.abs(input[i]-half*2) > 0) return i;
        }
        return -1;
    }
}
