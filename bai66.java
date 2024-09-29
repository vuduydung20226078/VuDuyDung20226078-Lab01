import javax.swing.JOptionPane;

public class bai66 {
    public static void main(String[] args) {
 
        int rows = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of rows:"));
        int cols = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of columns:"));

        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];

        JOptionPane.showMessageDialog(null, "Enter elements for Matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixA[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Enter element [" + i + "][" + j + "]:"));
            }
        }

        JOptionPane.showMessageDialog(null, "Enter elements for Matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixB[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Enter element [" + i + "][" + j + "]:"));
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        StringBuilder result = new StringBuilder("Sum of the two matrices:\n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.append(sumMatrix[i][j]).append(" ");
            }
            result.append("\n");
        }
        
        JOptionPane.showMessageDialog(null, result.toString());
    }
}
