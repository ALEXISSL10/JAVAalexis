import java.util.Scanner;

public class CalculatorBrain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 int a;
		 int b;
		 System.out.println("Ingresa un número: ");
		 a = console.nextInt();
		 System.out.println("Ingresa segundo número: ");
		 b = console.nextInt();	
		 
		 printSuma(a,b);
		 printResta(a,b);
		 printDiv(a,b);
		 printMul(a,b);
		 
		 console.close();
	
	
	private static void printSuma(int a, int b);
	{
		System.out.println(a+b);
	}	
		private static void printResta(int a, int b);
		{	
		System.out.println(a-b);
		}
		private static void printDiv(int a, int b);
		{
		System.out.println(a/b);
		}
		private static void printMul(int a, int b);
		{
		System.out.println(a*b);
		}
	}//main

}//CalculatorBrain 
