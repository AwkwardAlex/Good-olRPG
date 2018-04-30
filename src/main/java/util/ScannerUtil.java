package util;

import java.util.Scanner;

public class ScannerUtil {
    private static Scanner scanner;

    private ScannerUtil() throws IllegalStateException {
        throw new IllegalStateException("Can't create instance of ScannerUtil");
    }

    private static Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    public static String getString() {
        return getScanner().nextLine();
    }

    public static int getInt() {
        while (true) {
            int intInput;
            if (getScanner().hasNextInt()) {
                intInput = getScanner().nextInt();
                getScanner().nextLine();
                return intInput;
            } else {
                System.err.println("Incorrect input, please try again: ");
                getScanner().nextLine();
            }
        }
    }
}