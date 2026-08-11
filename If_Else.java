import java.util.Scanner;
public class If_Else {
    public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     System.out.println("Enter your Age");
    //     int age = input.nextInt();
    //     if (age>=18) {
    //         System.out.println("Eligible");
    //     }
    //     else{
    //         System.out.println("Not Eligible");
    //     }
    // }

    // Scanner input = new Scanner (System.in);
    // System.out.println("Enter a Number");
    // int Number = input.nextInt();
    // if (Number%2==0){
    //     System.out.println("Even Number");
    // }
    // else{
    //     System.out.println("Odd Number");
    // }

    // Scanner input = new Scanner (System.in);
    // System.out.println("Enter a Number 1 :");
    // int a = input.nextInt();
    // System.out.println("Enter a Number 2 :");
    // int b = input.nextInt();


    // if (a>b) {
    //     System.out.println("A is Greater");
    // }
    // else if (a==b) {
    //     System.out.println("A is Equal To B");
    // }
    // else{
    //     System.out.println("A is Lesser");
    // }

    // Scanner input = new Scanner (System.in);
    // System.out.println("Enter a Number :");
    // int button1 = input.nextInt();


    // if (button1==1) {
    //     System.out.println("Hello");
    // }
    // else if (button1==2) {
    //     System.out.println("Namaste");
    // }
    // else if (button1==3){
    //     System.out.println("Bonjour");
    // }
    // else{
    //     System.out.println("Invalid Button Entered");
    // }

    // CALCULATOR PROGRAM THROUGH IF ELSE IN JAVA
    // Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter First Number: ");
    //     int num1 = sc.nextInt();

    //     System.out.print("Enter Second Number: ");
    //     int num2 = sc.nextInt();

    //     System.out.println("Choose Operation");
    //     System.out.println("1. Addition (+)");
    //     System.out.println("2. Subtraction (-)");
    //     System.out.println("3. Multiplication (*)");
    //     System.out.println("4. Division (/)");

    //     System.out.println("Enter Choice (1-4)");
    //     int choice = sc.nextInt();

    //     if (choice == 1) {
    //         System.out.println("Answer = " + (num1 + num2));
    //     }
    //     else if (choice == 2) {
    //         System.out.println("Answer = " + (num1 - num2));
    //     }
    //     else if (choice == 3) {
    //         System.out.println("Answer = " + (num1 * num2));
    //     }
    //     else if (choice == 4) {
    //         if (num2 != 0) {
    //             System.out.println("Answer = " + (num1 / num2));
    //         } else {
    //             System.out.println("Division by Zero is not allowed.");
    //         }
    //     }
    //     else {
    //         System.out.println("Invalid Choice!");
    //     }

        //  EVEN ODD THORUGH IF-ELSE
        // Scanner input= new Scanner (System.in);
        // System.out.println("Enter a Number");
        // int even= input.nextInt();

        // if (even%2==0) {
        //     System.out.println("Even Number");
        // }
        // else{
        //     System.out.println("Odd Number");
        // }
    
        //      Kisi number ko input lo aur check karo ki Positive, Negative, ya Zero hai.
        // Scanner input= new Scanner (System.in);
        // System.out.println("Enter a Number");
        // int check= input.nextInt();

        // if (check<0) {
        //     System.out.println("Negative Number");
        // }

        // else if(check>0){
        //     System.out.println("Positive Number");
        // }

        // else{
        //     System.out.println("Equal Number");
        // }

        //      Kisi student ke marks input lo.
              //Marks >= 33 → Pass
               //Marks < 33 → Fail

        // Scanner input= new Scanner (System.in);
        // System.out.println("Enter a Marks");
        // int Marks= input.nextInt();

        // if (Marks>=33) {
        //     System.out.println("Pass");
        // }
        // else{
        //     System.out.println("Fail");
        // }

        // Scanner input= new Scanner (System.in);
        // System.out.println("Enter a Number");
        // int Number= input.nextInt();

        // if (Number % 5==0) {
        //     System.out.println("Divisible By 5 ");
        // }
        // else{
        //     System.out.println("Not Divisible By 5");
        // }

        //Kisi character ko input lo aur check karo ki Vowel hai ya Consonant.
        //  Scanner input= new Scanner (System.in);
        // System.out.println("Enter a Character");
        // char ch = input.next().charAt(0);

        // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        //     ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

        //     System.out.println("Vowel");
        // } else {
        //     System.out.println("Consonant");
        // }

        //     Kisi number ko input lo aur check karo ki wo 2 aur 3 dono se divisible hai ya nahi.
        // Scanner input= new Scanner (System.in);
        // System.out.println("Enter a Number");
        // int Number= input.nextInt();

        // if (Number%2==0 & Number%3==0) {
        //     System.out.println("Divisible By Both");
        // }
        // else if (Number%2==0) {
        //     System.out.println("Divisible By 2 ");
        // }
        // else if (Number%3==0) {
        //     System.out.println("Divisible By 3");
        // }
        // else{
        //     System.out.println("Not Dvisible By Both");
        // }
        
        //    Salary input lo.
          // Salary > 50000 → High Salary
             // Salary 20000–50000 → Medium Salary
          // Salary < 20000 → Low Salary

          Scanner input= new Scanner (System.in);
        System.out.println("Enter a Salary");
        int Salary = input.nextInt();

        if (Salary>50000) {
            System.out.println("High Salary");
        }
        else if (Salary<20000) {
            System.out.println("Low Salary");
        }
        else if (Salary>20000 && Salary<50000) {
            System.out.println("Medium Salary");
        }

        
}
}
