import java.util.Scanner;

public class Conversion {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion ");
        System.out.println("1) Convert from lbs to kgs: ");
        System.out.println("2) Convert from kgs to lbs: ");

        System.out.print("Enter a choice: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.print("Enter your weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("Your converted weight into kgs is %.2f ",newWeight );
        } else if (choice == 2) {
            System.out.print("Enter your weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20642;
            System.out.printf("Your converted weight into lbs is %.2f", newWeight);

        }
        else {
            System.out.println("Enter a valid choice.");
        }

        scanner.close();


    }
}
