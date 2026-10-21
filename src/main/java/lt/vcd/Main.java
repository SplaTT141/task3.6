package lt.vcd;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Iveskite skaiciu: ");
        int num = in.nextInt();

        for (int i = 2; i <= num; i++) {
            int count = 0;
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
            }
        }

    }
}
