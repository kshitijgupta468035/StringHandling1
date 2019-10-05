package practice1;

import java.util.Scanner;

public class StringHandle11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine().trim();
        char ch = scan.nextLine().trim().charAt(0);
        for (int i = 0; i < inputString.length(); i++) {
            //char c = inputString.charAt(i);        // also compare the ch with c by making creating char c
            if (inputString.charAt(i) == ch) {
                System.out.println(i);
            }
        }
    }
}