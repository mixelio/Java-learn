import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter a string:");
//        String userInput = inputData.next();
//        System.out.println("The first word - " + userInput);
        String userInput_1 = inputData.nextLine();
        System.out.println("The first line - " + userInput_1);
    }
}
