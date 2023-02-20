package ru.job4j.early;

public class PasswordValidator {

    public static boolean isDigit = false;
    public static boolean isUpper = false;
    public static boolean isLower = false;
    public static boolean isForbidden = false;
    public static boolean isSpecSymbol = false;
    public static char[] specSymbols = {'!', '@', '#', '$', '%', '^', '&', '+', '*', '_', '='};
    public static String[] forbiddenWords = {"qwerty", "12345", "password", "admin", "user"};

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        char[] symbols = password.toCharArray();
        for (char symbol : symbols) {
            if (Character.isUpperCase(symbol)) {
                isUpper = true;
            }
            if (Character.isLowerCase(symbol)) {
                isLower = true;
            }
            if (Character.isDigit(symbol)) {
                isDigit = true;
            }
        }
        for (String word : forbiddenWords) {
            if (password.toLowerCase().contains(word)) {
                isForbidden = true;
                break;
            }
        }
        for (char symbol : specSymbols) {
            if (password.contains(symbol + "")) {
                isSpecSymbol = true;
                break;
            }
        }
        if (!isDigit) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!isUpper) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!isLower) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (isForbidden) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, " +
                    "password, admin, user");
        }
        if (!isSpecSymbol) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        return password;
    }
}
