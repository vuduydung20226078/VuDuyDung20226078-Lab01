import javax.swing.JOptionPane;
class bai63 {
	public static  void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Please enter the height of the triangle (n):");
        int n = Integer.parseInt(input); 
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" "); 
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); 
            }
            System.out.println();
        }
	}
}
