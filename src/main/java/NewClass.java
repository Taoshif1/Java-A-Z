import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter value of first slide: ");
        int side1= scan.nextInt();
        
        System.out.println("Enter value of second slide: ");
        int side2= scan.nextInt();


        System.out.println("Enter value of third side: ");
        int side3= scan.nextInt();

        int sum = 0;
        if ((side1+side2>side3)&&(side2+side3>side1)&&(side1+side3>side2)) {
            System.out.println("Triangle");
            
        }
        else
            System.out.println("Not a triangle");
    }
}