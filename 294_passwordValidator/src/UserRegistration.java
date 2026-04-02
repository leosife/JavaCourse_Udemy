import java.util.Scanner;

public class UserRegistration {
    public void registerUser(String password, String confirmPassword) {
        try (ValidationLogger logger = new ValidationLogger()) {
            PasswordValidator validator = new PasswordValidator();
            validator.validatePassword(password, confirmPassword);
            // COMPLETE THIS PART: Log success message
            logger.logSuccess();
        } catch (WeakPasswordException | PasswordMismatchException e) {
            try (ValidationLogger logger = new ValidationLogger()) {
                // COMPLETE THIS PART: Log failure message
                logger.logFailure(e.getMessage());
            }
        } finally {
            try (ValidationLogger logger = new ValidationLogger()) {
                // COMPLETE THIS PART: Ensure completion message is printed once
                logger.close();
            }
        }
    }


}


