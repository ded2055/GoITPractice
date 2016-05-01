public class SetZero {
  public int set(int num, int i) {
    String numBits = Integer.toBinaryString(num);
    char[] bitsArray = numBits.toCharArray();
    char[] outputArray = new char[32];

    java.util.Arrays.fill(outputArray, '0');

    for (int j = 0; j < bitsArray.length; j++) {
      outputArray[outputArray.length - j-1] = bitsArray[bitsArray.length - j -1];
    }

    if ((outputArray[0] == '1') && (i < 32)){
      outputArray[0] = '0';
      outputArray[outputArray.length - i] = '0';
      return  -1*Integer.parseInt(new String(outputArray), 2) - 2;
    }

    outputArray[outputArray.length - i] = '0';

    return Integer.parseInt(new String(outputArray), 2);
  }
}
