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

            for (int z = 1; z <= row + 1 - i; z++) {
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
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTriangle(int row, int cols) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }

    public static void butterfly(int row, int cols) {
        int rc = row + cols;

        for (int i = 1; i <= row; i++) {

            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            // Spaces

            for (int z = 1; z <= (rc - i * 2); z++) {
                System.out.print("   ");
            }

            // Start
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int i = row; i >= 1; i--) {

            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            // Spaces

            for (int z = 1; z <= (rc - i * 2); z++) {
                System.out.print("   ");
            }

            // Start
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

    public static void solidRhombus(int num) {
        for (int i = 1; i <= num; i++) {
            // Spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void hollowRhombus(int num) {
        for (int i = 1; i <= num; i++) {
            // Spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= num; j++) {
                if (i == 1 || i == num || j == 1 || j == num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }

    public static void diamond(int row) {
        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= row- i; j++) {
                System.out.print(" ");
            }

            for (int z = 1; z <= 2*i-1; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = row; i >= 1; i--) {

            for (int j = 1; j <= row- i; j++) {
                System.out.print(" ");
            }

            for (int z = 1; z <= 2*i-1; z++) {
                System.out.print("*");
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
        // zeroOneTriangle(row, cols);
        // butterfly(row, cols);
        // solidRhombus(row);
        // hollowRhombus(row);
        diamond(row);

    }
}