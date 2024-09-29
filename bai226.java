import java.util.Scanner;
public class bai226 {
    //ax+b=0
    public static void solvePTB1(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh la: x = " + x);
        }
    }
    
    // hptb1 2 an
    public static void solveHPTB1(double a11, double a12, double b1, double a21, double a22, double b2) {
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;
        
        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("He phuong trinh co vo so nghiem.");
            } else {
                System.out.println("He phuong trinh vo nghiem.");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("Nghiem cua he la: x1 = " + x1 + ", x2 = " + x2);
        }
    }

    // ptb2
    public static void solvePTB2(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Day khong phai la phuong trinh bac 2. Chuyen sang phuong trinh bac nhat.");
            solvePTB1(b, c);
            return;
        }
        
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong trinh vi nghiem.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem: x1 = " + x1 + ", x2 = " + x2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solve ax+b=0
        System.out.println("Nhap he so a va b cua ptb1 ax + b = 0:");
        double a1 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        solvePTB1(a1, b1);

        // Solve hptb1 2 an
        System.out.println("Nhap cac he so cua he phuong trinh bac nhat 2 an:");
        System.out.println("a11 * x1 + a12 * x2 = b1");
        System.out.println("a21 * x1 + a22 * x2 = b2");
        double a11 = scanner.nextDouble();
        double a12 = scanner.nextDouble();
        double b2_1 = scanner.nextDouble();
        double a21 = scanner.nextDouble();
        double a22 = scanner.nextDouble();
        double b2_2 = scanner.nextDouble();
        solveHPTB1(a11, a12, b2_1, a21, a22, b2_2);

        // Solve ptb2
        System.out.println("Nhap cac he so a, b, c cua phuong trinh bac 2 ax^2 + bx + c = 0:");
        double a2 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        double c = scanner.nextDouble();
        solvePTB2(a2, b2, c);
    }
}
