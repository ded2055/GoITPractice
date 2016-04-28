public class MatrixTraversal {
    public int[] print(int[][] input) {
        int rowLength = input.length;
        int columnLength = input[0].length;
        int inputSize = rowLength*columnLength;
        int[] output = new int[inputSize];
        
        int row = 0;
        int column = 0;
        int current = 0;
        int p = 0;
        if (inputSize == 1) {
            output[current] = input[row][column];
            return output;
        }
        while (current < inputSize - 1)
        {
            while (column < columnLength - 1)
            {
                output[current] = input[row][column];
                current++;
                column++;
            }
            while (row < rowLength - 1)
            {
                output[current] = input[row][column];
                current++;
                row++;
            }
            while (column > p)
            {
                output[current] = input[row][column];
                current++;
                column--;
            }

            columnLength--;
            rowLength--;
            p++;
            while (row > p)
            {
                output[current] = input[row][column];
                current++;
                row--;
            }
            if (current == inputSize -1)
                output[current] = input[row][column];
        }

        return output;
    }
}
