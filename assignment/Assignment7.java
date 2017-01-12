package assignment;

import java.util.Scanner;

public class Assignment7 {
	
	
	public void Binary()
	{
		Scanner S=new Scanner(System.in);
		  System.out.print("Enter any number: ");  	
				int x =S.nextInt();
	S.close();
	Integer in = new Integer(x);
	String binary = Integer.toBinaryString(in);
	String[] binary2 = binary.split("");
	
	for (int i = 0 ;i < 0; i++)
	for (int j = 0 ; j < i; j++)
	{
		System.out.println("No. consutive 1's");
	}
	
	
	}
//	
//	for (int i1 = 0; i1 < x; i1++)
//	{	
//		System.out.println(binary2 [i1]);	
//	}
//	}
	
	
	public static void main(String a[]){
		Assignment7 B = new Assignment7();	
	B.Binary();
		}
}

	
