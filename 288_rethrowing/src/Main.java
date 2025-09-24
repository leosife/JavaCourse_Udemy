public class Main {
    public static void main(String[] args) {
    try {
        handdleUserRegistration("leonardo","1234");
        handdleUserRegistration("laura","");
    } catch (Exception e){
        System.out.println("Exception caught in main: "+ e.getMessage());
    }

    }

    public static void handdleUserRegistration(String username, String password) throws Exception {
        try {
            valitadePassword(password);
            System.out.println("User "+ username + "registered successfully");
        } catch (IllegalArgumentException e){
            System.out.println("Error in handleUserRegistration: "+ e.getMessage());
            // Adding context before rethrowing
            throw new Exception("Registration failed for user: "+ username, e);
        }
    }

    public static void valitadePassword(String password){
        if (password == null || password.isEmpty()){
            throw new IllegalArgumentException("password cannot be empty");
        }
    }

}