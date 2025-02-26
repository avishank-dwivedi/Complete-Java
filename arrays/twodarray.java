package arrays;

import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int col = sc.nextInt();

        int[][] number = new int[rows][col];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                number[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements of the array are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}


// import java.util.Scanner;

// public class twodarray {
//    public static void main(String[] args) {
//     int [][]array = new int[4][4];
//     Scanner sc = new Scanner(System.in);
//     int rows = sc.nextInt();
//     int col = sc.nextInt();
    
//     int [][] number = new int[rows][col];
//     for(int i=0 ; i<rows; i++){
//         for(int j=0; j<col ; j++){
//             number[i][j] = sc.nextInt();
//         }
//     }
//     int x =sc.nextInt();

//     for(int i=0; i<rows ; i++){
//         for(int j=0; j<col; j++){
//             if(number[i][j]== x){
//                 System.out.println("x found at location("+ i+","+j+")");
//             }

//         }
//     }

// }
// }