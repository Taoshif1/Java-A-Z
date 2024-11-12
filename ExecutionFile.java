import java.util.Scanner;

public class ExecutionFile{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num1 = scan.nextInt();
        int sum = 0;
        
        while(num1 > 0){
            sum += num1% 10;
            num1 /=10;
        }
        System.out.println("Sum: "+sum);
    }
}
