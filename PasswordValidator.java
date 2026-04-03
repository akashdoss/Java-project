import java.util.Scanner;

public class PasswordValidator {

    public static boolean isLengthValid(String password) {
        return password.length() >= 8;
    }

    public static boolean hasUpperCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasDigit(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static void validatePassword(String password) {
        boolean valid = true;

        if (!isLengthValid(password)) {
            System.out.println("Too short");
            valid = false;
        }

        if (!hasUpperCase(password)) {
            System.out.println("Missing an uppercase letter");
            valid = false;
        }

        if (!hasDigit(password)) {
            System.out.println("Missing a digit");
            valid = false;
        }

        if (valid) {
            System.out.println("Password is valid");
        }
    }

    public static boolean isValid(String password) {
        return isLengthValid(password) && hasUpperCase(password) && hasDigit(password);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        while (true) {
            System.out.print("Enter password: ");
            password = scanner.nextLine();

            validatePassword(password);

            if (isValid(password)) {
                break;
            }

            System.out.println("Try again\n");
        }

        scanner.close();
    }
}