public class SumDigits {
    public int sum(int number) {
        int result = 0;

        if (number == Integer.MIN_VALUE){
            return sum(Integer.MAX_VALUE)+1;
        }

        for(int i = Math.abs(number); i > 0; i /= 10)
            result += i%10;

        return result;
    }
}
