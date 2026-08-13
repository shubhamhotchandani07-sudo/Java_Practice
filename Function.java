import java.util.Scanner;
public class Function {

    // public static void printmyname(String name){
    //     System.out.println(name);
    //     return;
    // }
    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     String name=sc.next();

    //     printmyname(name);

    //MAKE A FUNCTION ADD TWO NUMBERS AND RETURN THE SUM
    // public static void sum(int sum){
    //     System.out.println(sum);
    //     return;
    // }

    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     System.out.println("Enter a Number");
    //     int number1=sc.nextInt();
    //     System.out.println("Enter a Number");
    //     int number2=sc.nextInt();

    //     sum(number1+number2);
    // }

    //make a function and multiply two numbers
    // public static void multiply(int multiply){
    //     System.out.println(multiply);
    //     return;
    // }

    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     System.out.println("Enter a Number");
    //     int number1=sc.nextInt();
    //     System.out.println("Enter a Number");
    //     int number2=sc.nextInt();

    //     multiply(number1*number2);
    // }

    // public static void fact(int n){
    //     if (n<0) {
    //         System.out.println("Invalid Number Entered");
    //         return;
    //     }
    //     int factorial=1;
    //     for(int i=n;i>=1;i--){
    //         factorial=factorial*i;    
    //     }
    //     System.out.println(factorial);
    // }
    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     System.out.println("Enter a Number");
    //     int n=sc.nextInt();

    //     fact(n);
    // }

    //Make a function to check if a given number n is even or not.
    // public static void even(int check){
    //     if (check%2==0) {
    //         System.out.println("Even Number");
    //     }
    //     else{
    //         System.out.println("Odd Numbers");
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     System.out.println("Enter a Number");
    //     int check=sc.nextInt();

    //     even(check);
   // }

    //Make a function to print the table of a given number n.
    // public static void table(int n){
        
    //     for(int k=1;k<=10;k++){
    //         System.out.println(k*n);
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     System.out.println("Enter a Number");
    //     int n=sc.nextInt();

    //     table(n);

    // }


    // }

    //Make a function to check if a number is prime or not.
//     public static void checkPrime(int n) {

//     int count = 0;

//     for (int i = 1; i <= n; i++) {
//         if (n % i == 0) {
//             count++;
//         }
//     }

//     if (count == 2) {
//         System.out.println("Prime");
//     } else {
//         System.out.println("Not Prime");
//     }
// }
// public static void main(String[] args) {
//     checkPrime(4);
// }
      
    //Enter 3 numbers from the user & make a function to print their average.
    // public static void average(int a, int b, int c) {
    //     int avg = (a + b + c) / 3;
    //     System.out.println("Average = " + avg);
    // }

    // public static void main(String[] args) {

    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Enter 3 numbers:");

    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int c = sc.nextInt();

    //     average(a, b, c);
    // }
     
    //Write a function to print the sum of all odd numbers from 1 to n.
    //  public static void sum(int num){
    //     int sum=0;
    //     for(int i=1;i<=num;i++){
    //         if (i%2!=0) {
    //             sum=sum+i;
    //         }
    //     }
    //     System.out.println(sum);
    //  }
    //  public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int num=sc.nextInt();

    //     sum(num);
    //  }

     //Write a function which takes in 2 numbers and returns the greater of those two.
    //  public static void greater(int num1,int num2){
    //     if (num1>num2) {
    //         System.out.println("num1 Is Greater");
    //     }
    //     else if (num1<num2) {
    //         System.out.println("Num2 Is Greater");
    //     }
    //     else if (num1==num2) {
    //         System.out.println("num1 and Num2 Is Equal");
    //     }
    //     else{
    //         System.out.println("Invalid Number Entered");
    //     }
    //  }
    //  public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int num1=sc.nextInt();
    //     int num2=sc.nextInt();

    //     greater(num1, num2);
    //  }

     //Write a function that takes in the radius as input and returns the circumference of a circle.
    //  public static double radius(int number){
    //     return 2*3.14*number;
    //  }

    //  public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int number=sc.nextInt();

    //     radius(number);

    //  }

     //Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
        // public static void age(int number){
        //     if (number>=18) {
        //         System.out.println("Eligible To Vote");
        //     }
        //     else{
        //         System.out.println("Not Eligible To Vote");
        //     }
        // }
        // public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int number=sc.nextInt();

        // age(number);
        // }

        //Write an infinite loop using do while condition.

    //   public static void loop(int number){
    //     int k=0;
    //     do{
    //         System.out.println(k);
    //         k=k+1;
    //     }while(true);
    //   }
    //   public static void main(String[] args) {
    //     loop(0);
    //   }



      //Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;
        int choice = 1;

        while (choice == 1) {

            System.out.println("Enter a number:");
            int number = sc.nextInt();

            if (number > 0) {
                positive++;
            }
            else if (number < 0) {
                negative++;
            }
            else {
                zero++;
            }

            System.out.println("Enter 1 to continue or 0 to stop:");
            choice = sc.nextInt();
        }

        System.out.println("Positive Numbers = " + positive);
        System.out.println("Negative Numbers = " + negative);
        System.out.println("Zeros = " + zero);
    }
}
    
