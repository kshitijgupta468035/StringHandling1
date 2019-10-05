package practice1;

import java.util.Scanner;

public class StringHandle7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine().trim();
        int sum = 0;
        for (int i = 0; i < inputString.length(); i++) {
            sum = sum + inputString.charAt(i);
        }
        System.out.println("Sum of all letters of the inputString " + sum);
        scan.close();
    }
}
