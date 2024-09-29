import javax.swing.JOptionPane;
import java.util.Arrays;

public class bai65 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of elements in the array:"));
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            myArray[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter element " + (i + 1) + ":"));
        }
        Arrays.sort(myArray);
        
        int sum = 0;
        for (int num : myArray) {
            sum += num;
        }
        double average = (double) sum / n;

        JOptionPane.showMessageDialog(null, "Sorted Array: " + Arrays.toString(myArray) +
                                            "\nSum: " + sum +
                                            "\nAverage: " + average);
    }
}
