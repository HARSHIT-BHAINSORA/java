// jagged arrays

import java.util.Scanner;

class Array{


public static void main(String args[])
{


    int arr[][] = new int [3][];
    
    Scanner sc = new Scanner(System.in);

    arr[0] = new int[3];
    arr[1] = new int[4];
    arr[2] = new int[2];

    for(int i = 0 ; i < arr.length ; i++)
    {
        for(int j = 0 ; j < arr[i].length ; j++)
        {
            int ele = sc.nextInt();
            arr[i][j] = ele;
        }
    }

    for(int i = 0 ; i < arr.length ; i++)
    {
        for(int j = 0 ; j < arr[i].length ; j++)
        {
            System.out.print(arr[i][j]+ " ");
        }
        System.out.println();
    }
} 

}