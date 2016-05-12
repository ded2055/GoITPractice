package goit.task4_2;


public class WordNumber {
    public int count(String input) {
        Boolean isLetterPrevious = false;
        int result = 0;

        char[] inputCharArray = input.toCharArray();

            for (int i = 0; i < inputCharArray.length; i++){
                if (Character.isLetter(inputCharArray[i]))
                {
                    isLetterPrevious = true;
                    continue;
                }
                if (isLetterPrevious)
                    result++;
                isLetterPrevious = false;
        }

        if (isLetterPrevious)
            result++;

        return result;
    }
}
