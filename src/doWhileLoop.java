import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] atgs) {
        int input = 0;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Enter number:");
            input = s.nextInt();
        } while (input != 5);
    }
}
