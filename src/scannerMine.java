import java.util.Scanner;

public class scannerMine {
    public static void main(String[] atgs) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter sth:");
        String input = s.nextLine();
        System.out.println("Entered text: " + input);

        int inputNum = s.nextInt();
        System.out.println("Entered num by 10: " + inputNum*10);
    }
}
