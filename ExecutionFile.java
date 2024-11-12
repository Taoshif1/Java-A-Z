import java.util.Scanner;

public class ExecutionFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        
        int lastDigit = num % 10;
        int firstDigit = num;
        
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        
        System.out.println("First digit: " + firstDigit + "\nLast digit: " + lastDigit);
    }
}
