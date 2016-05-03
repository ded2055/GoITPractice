package goit.task2_7;


import java.util.Arrays;

public class AddBinary {
    String add(String a, String b) {
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        if(a.equals("0") && b.equals("0")) return "0";
        if(a.equals("1") && b.equals("0")) return "1";
        if(a.equals("0") && b.equals("1")) return "1";

        if (a.length() > b.length())
        {
            char[] bTemp = new char[a.length()];
            Arrays.fill(bTemp, '0');

            System.arraycopy(bArray, 0, bTemp, a.length()-b.length(), b.length());
            bArray = bTemp;
        }
        if (a.length() < b.length())
        {
            char[] aTemp = new char[b.length()];
            Arrays.fill(aTemp, '0');

            System.arraycopy(aArray, 0, aTemp, b.length()-a.length(), a.length());
            aArray = aTemp;
        }

        char[] result = new char[aArray.length + 1];
        boolean overload = false;
        for (int i = 0; i < aArray.length; i++)
        {
            if ((aArray[aArray.length-i-1] == '1') && (bArray[bArray.length-i-1] == '1'))
            {
                if (overload)
                {
                    result[result.length - i - 1] = '1';
                    continue;
                }else
                {
                    result[result.length - i - 1] = '0';
                    overload = true;
                    continue;
                }
            }

            if ((aArray[aArray.length-i-1] == '0') &&(bArray[bArray.length-i-1] == '0'))
            {
                if (overload)
                {
                    result[result.length - i - 1] = '1';
                    overload = false;
                    continue;
                }else
                {
                    result[result.length - i - 1] = '0';
                    continue;
                }
            }

            if (((aArray[aArray.length-i-1] == '0') && (bArray[bArray.length-i-1] == '1')) ||
                    ((aArray[aArray.length-i-1] == '1') && (bArray[bArray.length-i-1] == '0')))
                if (overload){
                    result[result.length - i - 1] = '0';
                    continue;
                }else
                {
                    result[result.length - i - 1] = '1';

                }
        }
        if (overload) result[0] = '1';

        int k = 0;
        for (int i = 0; i < result.length-1; i++)
        {
            if (result[i] == '0') k = i;
            else break;
        }

        if (result[0] == '0') return new String(Arrays.copyOfRange(result, k, result.length-1));

        return new String(result);
    }
}
