import javax.swing.JOptionPane;

class ShowTwoNumbers225 {
    public static void main(String[] args) {
        String strNum1, strNum2;
        double num1, num2;
        String strNotification = "You've just entered: ";
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ",
                "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);  // Convert to double
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ",
                "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        num2 = Double.parseDouble(strNum2);  // Convert to double
        strNotification += num1 + " and " + num2;
        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);

        double tong = num1 + num2;
        double hieu = num1 - num2;
        double tich = num1 * num2;
        String thuong;

        if (num2 != 0) {
            thuong = String.valueOf(num1 / num2);
        } else {
            thuong = "Khong xac dinh";
        }
 
        String resultMessage = "Tong: " + tong + "\n" +
                               "Hieu: " + hieu + "\n" +
                               "Tich: " + tich + "\n" +
                               "Thuong: " + thuong;

        JOptionPane.showMessageDialog(null, resultMessage, "Results", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
