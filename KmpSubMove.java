package goit.task5_2;


public class KmpSubMove {
    public int subMoveQuantity(String inputStr, String resultStr) {
    int i = 0;
        while (!inputStr.equals(resultStr)) {
            if (i > inputStr.length()) return -1;
            inputStr = String.valueOf(inputStr.charAt(inputStr.length() - 1)) + String.valueOf(inputStr.substring(0, inputStr.length() - 1));
            i++;
        }
        return i;
    }
}
