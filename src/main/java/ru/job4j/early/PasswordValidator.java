package ru.job4j.early;

public class PasswordValidator {

    public static String validate(String password) {
        boolean isDigit = false;
        boolean isUpper = false;
        boolean isLower = false;
        boolean isSpecSymbol = false;
        String[] forbiddenWords = {"qwerty", "12345", "password", "admin", "user"};
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
            if (!Character.isDigit(symbol) && !Character.isLetter(symbol)) {
                isSpecSymbol = true;
            }
            if (isUpper && isLower && isDigit && isSpecSymbol) {
                break;
            }
        }
        for (String word : forbiddenWords) {
            if (password.toLowerCase().contains(word)) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, "
                        + "password, admin, user");
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
        if (!isSpecSymbol) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        return password;
    }
}
