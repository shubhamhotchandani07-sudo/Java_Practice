import java.util.Scanner;
public class Switch_Statement {
    public static void main(String[] args) {
        // Scanner input = new Scanner (System.in); 
        // int Button = input.nextInt();
        
        // switch (Button) {
        //     case 1:
        //         System.out.println("Hello");
        //         break;
        //     case 2:
        //         System.out.println("namaste");
        //         break;
        //     case 3:
        //         System.out.println("Bonjour");
        //         break;
        //     default:
        //         System.out.println("Invalid Entered");
        //         break;
        // }

        //   Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.
        // Scanner input = new Scanner (System.in); 
        
        // System.out.println("Enter a Number");
        // int Month = input.nextInt();
        
        // switch (Month) {
        //     case 1:
        //         System.out.println("January");
        //         break;
        //     case 2:
        //         System.out.println("Febuary");
        //         break;
        //     case 3:
        //         System.out.println("March");
        //         break;
        //     case 4:
        //         System.out.println("April");
        //         break;
        //     case 5:
        //         System.out.println("May");
        //         break;
        //         case 6:
        //         System.out.println("June");
        //         break;
        //         case 7:
        //         System.out.println("July");
        //         break;
        //         case 8:
        //         System.out.println("August");
        //         break;
        //         case 9:
        //         System.out.println("September");
        //         break;
        //         case 10:
        //         System.out.println("October");
        //         break;
        //         case 11:
        //         System.out.println("November");
        //         break;

        //     case 12:
        //         System.out.println("December");
        //         break;
        //     default:
        //         System.out.println("Invalid Entered");
        //         break;
        // }

        //    Menu Program
        // Scanner input = new Scanner (System.in); 
        // System.out.println("Enter a Number");
//         System.out.println("===== MENU =====");
// System.out.println("1. Pizza");
// System.out.println("2. Burger");
// System.out.println("3. Momos");
// System.out.println("4. Chowmein");
// System.out.println("5. Cold Coffee");

// System.out.print("Enter Your Choice: ");

        // int Food=input.nextInt();
        

        // switch (Food) {
        //     case 1:
        //         System.out.println("Pizza price : 120");
        //         break;
        //     case 2:
        //         System.out.println("Burger Price : 100");
        //         break;
        //     case 3:
        //         System.out.println("Momos Price : 80");
        //         break;
        //     case 4:
        //         System.out.println("Chowmein Price : 70");
        //         break;
        //     case 5:
        //         System.out.println("Cold Coffee Price : 60");
        //         break;
        //     default:
        //         System.out.println("Invalid Number Entered");
        //         break;
        // }

        //        Simple ATM
        Scanner input = new Scanner (System.in); 
        System.out.println("Enter ATM Option:");
        String ATM = input.nextLine();

        

        switch (ATM) {
            case "Balance Check":
                System.out.println("40000");
                break;
            case "Deposit":
                System.out.println("10000");
                break;
            case "Withdraw":
                System.out.println("20000");
                break;
            default:
                System.out.println("Invalid Number Entered");
                break;
        }
    }
}
