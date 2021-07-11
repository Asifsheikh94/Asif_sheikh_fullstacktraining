package knightingale;

import java.util.Scanner;

public class additon_scanner {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value of i....:");
		
		int i=scan.nextInt();
		
		System.out.println("enter the value of j....:");
		
		int j=scan.nextInt();
				
		int add=i+j;		
		System.out.println("the addition of i and j......:"+add);		
	}

}
