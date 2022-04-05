// construct an 2D array

import java.util.Scanner;

class Array{

    int arr[][] = new int [3][3];

    Scanner sc = new Scanner(System.in);

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
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
    
}