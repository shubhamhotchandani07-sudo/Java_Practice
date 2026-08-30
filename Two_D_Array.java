public class Two_D_Array {
    // public static void main(String[] args) {
    //     int [][] a = {{10,20,30},{10,90,80},{30,50,60}};

    //     for(int i=0;i<a.length;i++){
    //         for(int j=0;j<a[i].length;j++){
    //             System.out.print(a[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    // }

    //Is 2D array ke saare elements ka sum nikal ke print karo.
//     public static void main(String[] args) {
//         int[][] a = {
//     {10, 20, 30},
//     {40, 50, 60},
//     {70, 80, 90}
// };

//     int sum=0;
//     for(int i=0;i<a.length;i++){
//         for(int j=0;j<a.length;j++){
//             sum=sum+a[i][j];
//         }
//     }
//     System.out.println(sum);
//     }

    //Is array mein kitne even numbers hain, count karke print karo.
//     public static void main(String[] args) {
//         int[][] a = {
//     {10, 20, 30},
//     {40, 50, 60},
//     {70, 80, 90}
// };

//     int even=0;
//     for(int i=0;i<a.length;i++){
//         for(int j=0;j<a.length;j++){
//             if (a[i][j]%2==0) {
//                 even=even+1;
//             }
//         }
//     }
//     System.out.println(even);
//     }

    //s 2D array ka largest element find karke print kar.
//     public static void main(String[] args) {
//         int[][] a = {
//     {10, 25, 30},
//     {45, 12, 60},
//     {70, 85, 20}
// };

//     int largest = a[0][0];

//     for(int i = 0; i < a.length; i++){
//         for(int j = 0; j < a[i].length; j++){

//             if(a[i][j] > largest){
//                 largest = a[i][j];
//             }

//         }
//     }

//     System.out.println(largest);
// }
    //Har row ka sum print kar.
    public static void main(String[] args) {
        int[][] a = {
    {10, 20, 30},
    {40, 50, 60},
    {70, 80, 90}
};
    for(int i = 0; i < a.length; i++){
    
    int sum = 0;

    for(int j = 0; j < a[i].length; j++){
        sum = sum + a[i][j];
    }

    System.out.println(sum);
}
    }
}
