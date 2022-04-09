import java.util.Scanner;

class Array{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
	
	int flag = 0;

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println("Enter the element you wants to search");
        int searchEle = sc.nextInt();

        int arr[][] = new int[n][m];

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
            System.out.print("\n");
        }

        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[i].length ; j++)
            {
                if(arr[i][j] == searchEle)
                {
                    flag++;
                }
            }
            
        }
	
	if(flag != 0)
		System.out.println("Element founded ...");
	else
	        System.out.println("Element is not founded ... ");

    }
}
