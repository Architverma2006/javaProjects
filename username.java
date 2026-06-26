import java.util.Scanner;

public class username {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Validating username

        //Username must be between 4-12 characters
        //Username must not contain spaces or underscore

        String username;

        System.out.print("Enter your username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.print("Username must be between 4-12 characters. ");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain spaces or _ ");
        }
        else{
            System.out.println("Welcome " + username);
        }

        scanner.close();
    }
}
