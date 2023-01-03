import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class HollowRec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of hollow rectangle");
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= b; j++) {
                if (i == 1 || i == a || j == 1 || j == b) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

}
