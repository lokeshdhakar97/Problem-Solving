import java.util.*;

public class BinaryDecimal {

    public static void binToDec(int binNum) {
        int dec = 0;
        int count = 0;
        while (binNum > 0) {
            int last = binNum % 10;
            dec += last * (int) Math.pow(2, count);
            binNum /= 10;
            count++;
        }
        System.out.println("Decimal Number is: " + dec);
    }

    public static void decToBin(int decNum) {
        String bin = "";

        while (decNum > 0) {
            bin = decNum % 2 + bin;
            decNum /= 2;
        }
        System.out.println(bin);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int bin = sc.nextInt();
        decToBin(bin);

    }
}