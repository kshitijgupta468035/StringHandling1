package practice1;

import java.util.Scanner;

public class StringHandle9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine().trim();
        int upperWeight = 0;
        int lowerWeight = 0;
        int absoluteWeight;
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (c > 64 && c < 92) {
                upperWeight = upperWeight + inputString.charAt(i);
            } else if (c >= 92 && c < 127) {
                lowerWeight = lowerWeight + inputString.charAt(i);
            }
        }
        absoluteWeight = upperWeight - lowerWeight;
        System.out.print("Absolute Weight is " + Math.abs(absoluteWeight));
        scan.close();
    }
}
