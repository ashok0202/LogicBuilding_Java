package problems;

import java.util.Scanner;

public class fibonacciSeries {
	
	
	public static void printFibonacciNum(int n) {
		System.out.print("0 1");
		int num1=0;
		int num2=1;
		int num3;
		for(int i=2;i<n;i++) {
			num3=num1+num2;
			num1=num2;
			num2=num3;
		
			System.out.print(" "+num3);
		}
	}
	//using recersion;
	public static int recfib(int n) {
		if(n<=1) {
			return n;
		}
		return recfib(n-1)+recfib(n-2);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println(recfib(i));
		}
		printFibonacciNum(n);
	    sc.close();
		

	}

}
