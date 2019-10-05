package practice1;

import java.util.Scanner;

public class StringHandle2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine().trim();
        int indexValue = Integer.parseInt(scan.nextLine());
        System.out.println("Substring of given Input is " + string.substring(indexValue));
        scan.close();
    }
}
