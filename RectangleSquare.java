import java.util.Stack;

public class RectangleSquare {
    public int measure(int[] x, int[] h, int[] w) {
        Stack square = new Stack();
        int maxH = 0;
        int maxX = 0;
        int s = 0;
        int step = 10;

        for (int i = 0; i < x.length; i++)
            if ((x[i]+w[i]) > maxX) maxX = x[i]+w[i];

        for (int i = 0; i < maxX; i+=step) {
            for (int j = 0; j < x.length; j++) {
                if((i >= x[j]) && (i < x[j] + w[j]))
                    if (maxH < h[j]) maxH = h[j];
            }
            square.push(maxH*step);
            maxH = 0;
        }

        while (!square.empty())
            s += Integer.parseInt(String.valueOf(square.pop()));

        return s;
    }
}
