import java.util.Arrays;

/**
 * 
 * @author Vlada
 */

public class Main {
    /**
     * Main
     * @param args 
     */
 
    public static void main(String[] args) {
        int n = 4;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Row with max sum: " + (getRowIndexMax(array)+1));
    }
 /**
  * Max index row
  * @param array
  * @return 
  */
    private static int getRowIndexMax(int[][] array) {
        int sum = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int currentRow = 0;
            for (int j = 0; j < array.length; j++) {
                currentRow += array[i][j];
            }
            if (sum == 0) {
                sum = currentRow;
                index = i;
            } else {
                if (sum < currentRow) {
                    sum = currentRow;
                    index = i;
                }
            }
 
        }
        return index;
    }
}
    
