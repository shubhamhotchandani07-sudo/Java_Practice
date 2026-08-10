import java.util.Scanner;
public class User_Input {
    public static void main(String[] args) {
        //  IN ORDER TO READ DATA FROM THE KEYWORD JAVA HAS A SCANNER CLASS
        //  SCANNER CLASS HAVE A LOTS OF METHODS TO READ A DATA FROM THE KEYBOARD
        //FORMAT SCANNER --> SCANNER SC = NEW SCANNER (SYSTEM.IN)
        System.out.println("Taking Input From the User");
        Scanner input = new Scanner(System.in);
        System.out.println("ENter Number1 :");
        int a = input.nextInt();
        System.out.println("ENter Number2 :");
        int b = input.nextInt();
        System.out.println("The Total of a+b ");
        System.out.println( a+b);

        System.out.println("*\n**\n***\n****\n*****");
    }
}

