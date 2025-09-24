public class PasswordValidator {
    public void validadePassword(String password, String confirmPassword)
            throws WeakPasswordException, PasswordMismatchException {
        if (password.length() < 8) {
            throw new WeakPasswordException("Password must be as least 8 characters");
        }

        if (password.length() > 20) {
            throw new WeakPasswordException("Password must not exceed 20 characters");
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialCharacter = false;
        String specialCharacters = "!@#$%^&*()-+";

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;

            } else if (Character.isDigit(ch)) {
                hasDigit = true;

            } else if (specialCharacters.indexOf(ch) >= 0) {
                hasLowerCase = true;

            }


        }

        if (!hasLowerCase || !hasDigit || !hasUpperCase || !hasSpecialCharacter) {
            throw new WeakPasswordException("THe password must contain at least one Upper Case letter, " +
                    "one Lower Case letter, one Special character and one number");
        }


        if (!password.equals(confirmPassword)) {
            throw new PasswordMismatchException("Passwords do not match.");
        }
    }
}

