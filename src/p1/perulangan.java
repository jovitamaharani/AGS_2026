package p1;

import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);
        long nim,n;
        
        System.out.print("Masukan NIM: ");
        nim = jovita.nextLong();

        n = nim % 100;

        if (n < 10) {
            n += 10;
        }

        System.out.println(n);

        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue;
            } else if (i % 3 == 0) {
                System.out.print(" # ");
            } else if (i % 2 == 1) {
                System.out.print(" * ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    
}
