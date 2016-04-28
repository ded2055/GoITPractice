public class JoinCharacters {
  public int join(char[] input) {
       StringBuilder concatenatedStringBuilder = new StringBuilder();

       concatenatedStringBuilder.append(input);
       String concatenatedString = concatenatedStringBuilder.toString();

       return Integer.valueOf(concatenatedString);
  }
}
