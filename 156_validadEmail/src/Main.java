import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = "leo.sife96@gmail.com";
        String part1="",part2="";
        int arroba = 0;
        boolean emailOK = true;
        do {
            System.out.println("EMAIL: ");
            email = sc.nextLine();
            if(email.contains("@")){
                if(email.indexOf("@")==0 || email.indexOf("@") == email.length()-1){
                    System.out.println("ERROR: @ cannot be your first or last character");
                    emailOK = false;
                } else {
                    arroba = email.indexOf("@");
                    part1 = email.substring(0,arroba);
                    part2 = email.substring(arroba+1);
                }

                if (part2.contains("@")) {
                    System.out.println("ERROR: An email cannot have more than one @");
                    emailOK = false;
                }
                if (email.contains(".")) {
                    if (part2.indexOf(".") == 0){
                        System.out.println("ERROR: You cant put a . after the @");
                        emailOK = false;
                    } else if (part1.lastIndexOf(".") == arroba - 1){
                        System.out.println("ERROR: You cant put a . before the @");
                        emailOK = false;
                    }


                } else {
                    System.out.println("ERROR: You must have a dot after the @");
                    emailOK = false;
                }
            }

            System.out.println(part1);
            System.out.println(part2);

        }while(emailOK = true);


    sc.close();
    }
}