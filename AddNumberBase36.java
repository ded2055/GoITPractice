package goit.task2_1;

public class AddNumberBase36 {
    public String add (String a, String b){
        int radix36 = 36;
        java.math.BigInteger summandA = new java.math.BigInteger(a, radix36);
        java.math.BigInteger summandB = new java.math.BigInteger(b, radix36);

        return summandA.add(summandB).toString(radix36);
    }
}
