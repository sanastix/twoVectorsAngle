package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        scan.close();

        int dot_product = a * c + b * d;

        double lengthAB = Math.sqrt(a * a + b * b);
        double lengthCD = Math.sqrt(c * c + d * d);

        double cos_theta = dot_product / (lengthAB * lengthCD);

        double theta = Math.acos(cos_theta);

        if (theta < 0) {
            theta = -theta;
        } else if (theta > Math.PI) {
            theta = 2 * Math.PI - theta;
        }

        String s = String.format("%.5f", theta);
        System.out.println(s);
    }
}
