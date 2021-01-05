import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckTriangle {
    public static void main(String[] args) {
        double a = 0, b = 0, c=0;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("nhap vao 3 canh tam giac");
                System.out.print("canh 1: ");
                a = scanner.nextDouble();
                System.out.print("canh 2: ");
                b = scanner.nextDouble();
                System.out.print("canh 3:  ");
                c = scanner.nextDouble();
                try {
                    Triangle triangle = new Triangle(a,b,c);
                } catch (IllegalTriangleException i){
                    System.out.println(i.getMessage());
                }
            } catch (InputMismatchException i) {
                System.out.println("canh tam giac phai la so");
            }

        }
    }

}
