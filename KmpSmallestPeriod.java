package goit.task5_1;


public class KmpSmallestPeriod {
    public String findSmalletstPeriod(String input) {
        int[] p = prefixFunction(input);

        int t = input.length() - p[p.length - 1];
        String result = "";

        if (t > 0)
            for (int i = 0; i < t; i++)
                result += input.charAt(i);

        return result;
    }

    public static int[] prefixFunction(String s) {
        int[] p = new int[s.length()];
        int k = 0;
        for (int i = 1; i < s.length(); i++) {
            while (k > 0 && s.charAt(k) != s.charAt(i))
                k = p[k - 1];
            if (s.charAt(k) == s.charAt(i))
                ++k;
            p[i] = k;
        }
        return p;
    }
}
