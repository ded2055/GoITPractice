package goit.task2_4;


public class AbcNumber {
    public int convert(String num) {
        char[] letters = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        char[] input = num.toCharArray();
        String output = "";

        for (char e :
                input) {
            for (int i = 0; i < letters.length; i++)
                if (e == letters[i]) output += i;
        }
        return Integer.parseInt(output);
    }
}
