package ramu;

import java.util.Scanner;
public class newKnight
{
	public static void main(String args[])
	{
		String board[][] = new String[8][8];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of knights");
		int count = sc.nextInt();
		System.out.println("Enter the number of king");
		int count1 = sc.nextInt();
		
		int i,k,n,k1,n1;
		
		initial(board);
		for(i=0;i<count;i++)
		{
			k = sc.nextInt()-1;
			n = sc.nextInt()-1;
			
			mc(board,k-1,n-2,i);
			mc(board,k-2,n-1,i);
			mc(board,k+1,n-2,i);
			mc(board,k+2,n-1,i);
			mc(board,k-1,n+2,i);
			mc(board,k-2,n+1,i);
			mc(board,k+1,n+2,i);
			mc(board,k+2,n+1,i);
			display(board);
		}
		System.out.println("position which are affected by Knights");
		

		for(i=0;i<count1;i++) {
		
		k1 = sc.nextInt()-1;
		n1 = sc.nextInt()-1;
		
		mc(board,k1+1,n1,i);
		mc(board,k1-1,n1,i);
		mc(board,k1,n1-1,i);
		mc(board,k1,n1+1,i);
		mc(board,k1+1,n1-1,i);
		mc(board,k1+1,n1+1,i);
		mc(board,k1-1,n1+1,i);
		mc(board,k1+1,n1-1,i);
		
		
		display(board);
		}System.out.println("position which are affected by Knights and King");
		
	}
	public static void mc(String arr[][], int r, int c, int m)
	{
		if((r>=0 && r<=7) && (c>=0 && c<=7))
		{
			arr[r][c] = arr[r][c] + Integer.toString(m);
		}
	}
	
	public static void display(String arr[][])
	{
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				System.out.print(arr[i][j] + "\t|");
			}
			System.out.println();
		}
	}
	
	public static void initial(String arr[][])
	{
		
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				arr[i][j] = " ";
			}
		}
	}
}