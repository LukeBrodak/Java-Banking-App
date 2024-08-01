package courseProjectJava2;

import java.util.Scanner;

public class DataEntry {
    private static Scanner scanner = new Scanner(System.in);

    public static String getCustomerId() {
        while (true) {
            String input = getLimitedString("Enter Customer ID (max 5 characters): ", 5);
            if (!input.isBlank()) {
                return input;
            }
            System.out.println("Customer ID cannot be blank. Please try again.");
        }
    }

    public static String getSsn() {
        while (true) {
            String input = getNumericString("Enter SSN (9 digits): ");
            if (input.length() == 9) {
                return input;
            }
            System.out.println("SSN must be exactly 9 digits. Please try again.");
        }
    }

    public static String getLastName() {
        return getLimitedString("Enter Last Name (max 20 characters): ", 20);
    }

    public static String getFirstName() {
        return getLimitedString("Enter First Name (max 15 characters): ", 15);
    }

    public static String getStreet() {
        return getLimitedString("Enter Street (max 20 characters): ", 20);
    }

    public static String getCity() {
        return getLimitedString("Enter City (max 20 characters): ", 20);
    }

    public static String getState() {
        while (true) {
            String input = getLimitedString("Enter State (2 characters): ", 2);
            if (input.length() == 2) {
                return input;
            }
            System.out.println("State must be exactly 2 characters. Please try again.");
        }
    }

    public static String getZip() {
        while (true) {
            String input = getNumericString("Enter ZIP (5 digits): ");
            if (input.length() == 5) {
                return input;
            }
            System.out.println("ZIP must be exactly 5 digits. Please try again.");
        }
    }

    public static String getPhone() {
        while (true) {
            String input = getNumericString("Enter Phone (10 digits): ");
            if (input.length() == 10) {
                return input;
            }
            System.out.println("Phone number must be exactly 10 digits. Please try again.");
        }
    }

    public static String getLimitedString(String prompt, int maxLength) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            if (input.length() <= maxLength) {
                return input;
            }
            System.out.println("Input exceeds maximum length of " + maxLength + ". Please try again.");
        }
    }

    public static String getNumericString(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            if (input.matches("\\d+")) {
                return input;
            }
            System.out.println("Input must contain only numeric values. Please try again.");
        }
    }
}
