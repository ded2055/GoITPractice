package goit.task3_3;


import java.util.Stack;

public class ReversePolishNotation {
    public int evaluate(String expression) {
        String[] splittedExpression = expression.split(" ");
        Stack polishStack = new Stack();

        if (splittedExpression.length == 1) return Integer.parseInt(splittedExpression[0]);

        int a, b;
        int temp = 0;
        for (int i = 0; i < splittedExpression.length; i++) {
            try {
                temp = Integer.parseInt(splittedExpression[i]);
                polishStack.push(temp);
                continue;

            }catch (NumberFormatException e) {
                if (splittedExpression[i].equals("+"))
                {
                    b = Integer.parseInt(String.valueOf(polishStack.pop()));
                    a = Integer.parseInt(String.valueOf(polishStack.pop()));
                    polishStack.push(String.valueOf(a+b));
                }
                if (splittedExpression[i].equals("-"))
                {
                    b = Integer.parseInt(String.valueOf(polishStack.pop()));
                    a = Integer.parseInt(String.valueOf(polishStack.pop()));
                    polishStack.push(String.valueOf(a-b));
                }
                if (splittedExpression[i].equals("*"))
                {
                    b = Integer.parseInt(String.valueOf(polishStack.pop()));
                    a = Integer.parseInt(String.valueOf(polishStack.pop()));
                    polishStack.push(String.valueOf(a*b));
                }
                if (splittedExpression[i].equals("/"))
                {
                    b = Integer.parseInt(String.valueOf(polishStack.pop()));
                    a = Integer.parseInt(String.valueOf(polishStack.pop()));
                    polishStack.push(String.valueOf(a/b));
                }
            }
        }

        return Integer.parseInt((String) polishStack.pop());
    }
}
