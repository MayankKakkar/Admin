package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment6 {
	
	public static int [] readNumsFromCommandLine()
	{
	Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        s.nextLine(); // throw away the newline.

        int [] numbers = new int[count];
        Scanner numScanner = new Scanner(s.nextLine());
        for (int i = 0; i < count; i++) 
        {
            if (numScanner.hasNextInt())
            {
                numbers[i] = numScanner.nextInt();
            }
            
//            else {
//                System.out.println("You didn't provide enough numbers");
//              
//               break;
//               
//               }
//            numScanner.close();
//        }
//        s.close();
//        return numbers;
//    }
//
//    public static void main(String[] args) 
//    {
//        int[] numbers = readNumsFromCommandLine();
//     System.out.println(Arrays.toString(numbers));
//        
 //       System.out.println(Arrays.toString(numbers));
        }  }
}
	
	
//	int[] arr;
//	
//	
//	public void Array()
//	{
//		Scanner S=new Scanner(System.in);
//		  System.out.println("Enter the size of Array");  	
//				int arr=S.nextInt();
//		
//		System.out.println("Input Array Elements");
//				
//				
//	}
//	
//	
//	public static void main (String[]args)
//	
//	{
//		Assignment6 Y = new Assignment6();
//		Y.Array();
//	}

//}
