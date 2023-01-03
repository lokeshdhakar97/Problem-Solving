import java.util.Scanner;

public class Pramid {

    public static void rotateHalfPramid(int row, int cols) {
        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= i; z++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void invertedHalfPramid(int row, int cols) {
        for (int i = 1; i <= row; i++) {

            for (int z = 1; z <= row + 1 -i; z++) {
                System.out.print(z);
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void floydTriangle(int row, int cols) {
        
        int num = 1;
        for(int i= 1; i<=row; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTriangle(int row, int cols) {
        
        int num = 1;
        for(int i= 1; i<=row; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of pramid: ");
        int row = scan.nextInt();
        int cols = scan.nextInt();
        scan.close();
        // rotateHalfPramid(row, cols);
        // invertedHalfPramid(row, cols);
        zeroOneTriangle(row, cols);
    }
}