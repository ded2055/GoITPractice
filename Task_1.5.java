public class MatrixSnakeTraversal {
   public int[] print(int[][] input) {
     int inputSize = input.length * input[0].length;
     int[] output = new int[inputSize];

     int inputElementCount = 0;
     int row = 0;
     int column = 0;
     int m = 0;
     while (inputElementCount < inputSize) {
       while (row < input.length) {
         output[m] = input[row][column];
         row++;
         m++;
         inputElementCount++;
       }
       column++;
       if (column < input[0].length)
         while (row > 0) {
           row--;
           output[m] = input[row][column];
           m++;
           inputElementCount++;
       } else continue;
       column++;
     }
   return output;
  }
}
