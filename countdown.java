import java.util.Scanner;

public class countdown {
    public static void main(String[] args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        int max;
        int i;

        System.out.print("Enter a number to begin countdown: ");
        max = scanner.nextInt();

        for(i = max; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Rocket Launched");
    }
}
