import javax.swing.JOptionPane;

public class bai64 {
    public static void main(String[] args) {
        while (true) {
            try {
                String monthInput = JOptionPane.showInputDialog("Enter the month:");
                String yearInput = JOptionPane.showInputDialog("Enter the year:");

             
                int year = Integer.parseInt(yearInput);
                if (year < 0) {
                    JOptionPane.showMessageDialog(null, "Year must be a non-negative number. Please try again.");
                    continue;
                }

              
                int days = getDaysInMonth(monthInput, year);
                if (days == -1) {
                    JOptionPane.showMessageDialog(null, "Invalid month. Please try again.");
                } else {
                    JOptionPane.showMessageDialog(null, "Number of days in " + monthInput + "/" + year + ": " + days);
                    break; 
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input for year. Please enter a valid non-negative number.");
            }
        }
    }

    private static int getDaysInMonth(String month, int year) {
        switch (month.toLowerCase()) {
            case "january":
            case "jan":
            case "1":
                return 31;
            case "february":
            case "feb":
            case "2":
                return isLeapYear(year) ? 29 : 28;
            case "march":
            case "mar":
            case "3":
                return 31;
            case "april":
            case "apr":
            case "4":
                return 30;
            case "may":

            case "5":
                return 31;
            case "june":
            case "jun":
            case "6":
                return 30;
            case "july":
            case "jul":
            case "7":
                return 31;
            case "august":
            case "aug":
            case "8":
                return 31;
            case "september":
            case "sep":
            case "9":
                return 30;
            case "october":
            case "oct":
            case "10":
                return 31;
            case "november":
            case "nov":
            case "11":
                return 30;
            case "december":
            case "dec":
            case "12":
                return 31;
            default:
                return -1; 
        }
    }

    private static boolean isLeapYear(int year) {
        
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
